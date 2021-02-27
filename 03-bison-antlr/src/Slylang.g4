grammar Slylang;

@header {
    import java.util.ArrayList;
    import java.util.HashSet;
    import java.util.stream.Collectors;
}

file returns [String cpp]
    : xs=functionDefinitions EOF
    {
        ArrayList<String> lines = new ArrayList<String>();

        lines.add("#include <iostream>");
        lines.add("using namespace std;");
        lines.add("");
        lines.addAll($xs.declarations);
        lines.add($xs.cpp);

        $cpp = String.join("\n", lines);
    }
    ;

functionDefinitions returns [String cpp, ArrayList<String> declarations]
    : xs=functionDefinitions x=functionDefinition
    { $cpp = String.format("%s\n\n%s", $xs.cpp, $x.cpp); $declarations = $xs.declarations; $declarations.add($x.declaration); }
    | /* epsilon */
    { $cpp = ""; $declarations = new ArrayList<String>(); }
    ;

functionDefinition returns [String cpp, String declaration]
    : ID a=argumentsClosure LCB  s=statements RCB
    {
        String args = String.join(", ", $a.list.stream().map(str -> "int " + str).collect(Collectors.toList()));
        $declaration = String.format(
            "int %s(%s);",
            $ID.text,
            args
        );
        $s.used.removeAll($a.list);
        $s.used.add("_");
        $cpp = String.format(
            "int %s(%s) {\nint %s;\n\n%s\n}",
            $ID.text,
            args,
            String.join(", ", $s.used),
            String.join("\n", $s.list)
        );
    }
    ;

argumentsClosure returns [List<String> list]
    : LP xs=argumentS RP
    { $list = $xs.list.stream().map(str -> "_" + str).collect(Collectors.toList()); }
    | /* epsilon */
    { $list = new ArrayList<String>(); }
    ;

ret returns [String cpp]
    : RET x=expression
    { $cpp = String.format("return %s;", $x.cpp); }
    ;

argumentS returns [ArrayList<String> list]
    : ID COMMA?
    { $list = new ArrayList<String>(); $list.add($ID.text); }
    | xs=arguments_ ID COMMA?
    { $list = $xs.list; $list.add($ID.text); }
    ;

arguments_ returns [ArrayList<String> list]
    : /* epsilon */
    { $list = new ArrayList<String>(); }
    | xs=arguments_ ID COMMA
    { $list = $xs.list; $list.add($ID.text); }
    ;

statements returns [ArrayList<String> list, HashSet<String> used]
    : /* epsilon */
    {
        $list = new ArrayList<String>();
        $used = new HashSet<String>();
    }
    | xs=statements x=statement[$xs.list, $xs.used]
    {
        $used = $xs.used;
        $list = $xs.list;
    }
    ;

statement[ArrayList<String> list, HashSet<String> used]
    : x=assignment[used]
    { $list.add($x.cpp); }
    | y=ret
    { $list.add($y.cpp); }
    | z=expression
    { $list.add($z.cpp); }
    | if_stmt[list, used]
    | loop[list, used]
    | for_stmt[list, used]
    | s=scan_stmt[used]
    { $list.add($s.cpp); }
    | e=echo_stmt
    { $list.add($e.cpp); }
    | BREAK
    { $list.add("break;"); }
    | CONTINUE
    { $list.add("continue;"); }
    ;

scan_stmt[HashSet<String> used] returns [String cpp]
    : SCAN ID
    { $cpp = String.format("cin >> %s;", "_" + $ID.text); $used.add("_" + $ID.text); }
    ;

echo_stmt returns [String cpp]
    : ECHO x=expression
    { $cpp = String.format("cout << %s << endl;", $x.cpp); }
    ;

if_stmt[ArrayList<String> list, HashSet<String> used]
    : IF c=expression LCB ss=statements RCB el=else_
    {
        $list.add(String.format("if (%s) {", $c.cpp));
        $list.addAll($ss.list);
        $list.add("}");
        $list.addAll($el.list);
        $used.addAll($ss.used);
        $used.addAll($el.used);
    }
    ;

else_ returns [ArrayList<String> list, HashSet<String> used]
    : es=elifs_
    { $list = $es.list; $used = $es.used; }
    | es=elifs_ ELSE LCB ss=statements RCB
    {
        $list = $es.list;
        $list.add("else {");
        $list.addAll($ss.list);
        $list.add("}");
        $used = $es.used;
        $used.addAll($ss.used);
    }
    ;

elifs_ returns [ArrayList<String> list, HashSet<String> used]
    : /* epsilon */
    { $list = new ArrayList<String>(); $used = new HashSet<String>(); }
    | i=elifs_ ELIF c=expression LCB ss=statements RCB
    {
        $list = $i.list;
        $list.add(String.format("else if (%s) {", $c.cpp));
        $list.addAll($ss.list);
        $list.add("}");
        $used = $i.used;
        $used.addAll($ss.used);
    }
    ;


loop[ArrayList<String> list, HashSet<String> used]
    : LOOP c=expression LCB ss=statements RCB
    {
        $list.add(String.format("while (%s) {", $c.cpp));
        $list.addAll($ss.list);
        $list.add("}");
        $used.addAll($ss.used);
    }
    | LOOP LCB ss=statements RCB
    {
        $list.add("while (true) {");
        $list.addAll($ss.list);
        $list.add("}");
        $used.addAll($ss.used);
    }
    ;

for_stmt[ArrayList<String> list, HashSet<String> used]
    : FOR ID IN l=expression UNTIL r=expression LCB ss=statements RCB
    {
        $list.add(String.format("for (int _%s = %s; _%s < %s; _%s++) {", $ID.text, $l.cpp, $ID.text, $r.cpp, $ID.text));
        $list.addAll($ss.list);
        $list.add("}");
        $used.addAll($ss.used);
    }
    ;

assignment[HashSet<String> used] returns [String cpp]
    : xs=argumentS ASSIGN ys=expressionS
    {
        ArrayList<String> lines = new ArrayList<String>();
        for (int i = 0; i < $xs.list.size(); i++) {
            String tmpName = String.format("__tmp_%s", $xs.list.get(i));
            $used.add("_" + $xs.list.get(i));
            $used.add(tmpName);
            lines.add(String.format("%s = %s;", tmpName, $ys.list.get(i)));
        }
        for (String name : $xs.list) {
            lines.add(String.format("_%s = __tmp_%s;", name, name));
        }

        $cpp = String.join("\n", lines);
    }
    ;

expressionS returns [ArrayList<String> list]
    : x=expression
    { $list = new ArrayList<String>(); $list.add($x.cpp); }
    | xs=expressionS COMMA x=expression
    { $list = $xs.list; $list.add($x.cpp); }
    ;

expression returns [String cpp]
    : INT
    { $cpp = $INT.text; }
    | ID
    { $cpp = "_" + $ID.text; }
    | ID LP xs=expressionS RP
    { $cpp = String.format("%s(%s)", $ID.text, String.join(", ", $xs.list)); }
    | LP x=expression RP
    { $cpp = String.format("(%s)", $x.cpp); }
    | NOT e=expression
    { $cpp = String.format("!%s", $e.cpp); }
    | l=expression MULTIPLY r=expression
    { $cpp = String.format("%s * %s", $l.cpp, $r.cpp); }
    | l=expression DIVIDE r=expression
    { $cpp = String.format("%s / %s", $l.cpp, $r.cpp); }
    | l=expression MOD r=expression
    { $cpp = String.format("%s %% %s", $l.cpp, $r.cpp); }
    | l=expression PLUS r=expression
    { $cpp = String.format("%s + %s", $l.cpp, $r.cpp); }
    | l=expression MINUS r=expression
    { $cpp = String.format("%s - %s", $l.cpp, $r.cpp); }
    | l=expression EQ r=expression
    { $cpp = String.format("%s == %s", $l.cpp, $r.cpp); }
    | l=expression NOT_EQ r=expression
    { $cpp = String.format("%s != %s", $l.cpp, $r.cpp); }
    | l=expression LT r=expression
    { $cpp = String.format("%s < %s", $l.cpp, $r.cpp); }
    | l=expression GT r=expression
    { $cpp = String.format("%s > %s", $l.cpp, $r.cpp); }
    | l=expression AND r=expression
    { $cpp = String.format("%s && %s", $l.cpp, $r.cpp); }
    | l=expression XOR r=expression
    { $cpp = String.format("%s ^ %s", $l.cpp, $r.cpp); }
    | l=expression OR r=expression
    { $cpp = String.format("%s || %s", $l.cpp, $r.cpp); }
    ;


IF : 'if';
ELIF : 'elif';
ELSE : 'else';
LOOP : 'loop';
FOR : 'for';
IN : 'in';
UNTIL : 'until';
BREAK : 'break';
CONTINUE : 'continue';
SCAN : 'scan';
ECHO : 'echo';
RET : 'ret';
AND : 'and';
OR  : 'or';
XOR : 'xor';
NOT : 'not';
NOT_EQ : '!=';
EQ : '==';
PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIVIDE : '/';
MOD : '%';
ASSIGN : '=';
COMMA : ',';
LP : '(';
RP : ')';
LT : '<';
GT : '>';
LCB : '{';
RCB : '}';
ID : [a-zA-Z][a-zA-Z0-9]*;
INT : [+-]?([0-9]|[1-9][0-9]*);
WS : [ \t\r\n]+ -> skip;
