import java.io.BufferedReader
import java.io.StringReader

data class Tree(val string: String? = null, val children: Array<Tree> = emptyArray()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Tree

        if (string != other.string) return false
        if (!children.contentEquals(other.children)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = string?.hashCode() ?: 0
        result = 31 * result + children.contentHashCode()
        return result
    }
}

class Parser {
    private val lexer: Lexer

    constructor(string: String) {
        lexer = Lexer(BufferedReader(StringReader(string)))
    }

    constructor(reader: BufferedReader) {
        lexer = Lexer(reader)
    }

    private fun common(a: () -> Tree, b: () -> ArrayDeque<Tree>): Tree {
        var result = a()
        val tail = b()

        while (tail.isNotEmpty()) {
            val op = tail.removeFirst()
            val right = tail.removeFirst()
            result = Tree(op.string, arrayOf(result, right))
        }

        return result
    }

    private fun commonOp(ops: Array<Token>, a: () -> Tree): ArrayDeque<Tree> {
        for (op in ops) {
            if (lexer.lastToken != op) {
                continue
            }

            lexer.nextToken()
            val sub = a()
            val result = commonOp(ops, a)
            result.addFirst(sub)
            result.addFirst(Tree(op.string))
            return result
        }

        return ArrayDeque()
    }

    private fun parsePrimary(): Tree {
        return when (lexer.lastToken) {
            Token.VAR -> Tree(lexer.lastVar)
            Token.LP -> {
                lexer.nextToken()
                val inner = parseOr()
                assert(lexer.lastToken == Token.RP)
                inner
            }
            else -> throw AssertionError()
        }.also { lexer.nextToken() }
    }

    private fun parseBelongs(): Tree = common(this::parsePrimary, this::parseBelongs1)

    private fun parseBelongs1(): ArrayDeque<Tree> = commonOp(arrayOf(Token.IN, Token.NOT_IN), this::parsePrimary)

    private fun parseNot(): Tree {
        return when (lexer.lastToken) {
            Token.VAR, Token.LP -> parseBelongs()
            Token.NOT -> {
                lexer.nextToken()
                Tree("not", arrayOf(parseBelongs()))
            }
            else -> throw AssertionError()
        }
    }

    private fun parseAnd(): Tree = common(this::parseNot, this::parseAnd1)

    private fun parseAnd1(): ArrayDeque<Tree> = commonOp(arrayOf(Token.AND), this::parseNot)

    private fun parseXor(): Tree = common(this::parseAnd, this::parseXor1)

    private fun parseXor1(): ArrayDeque<Tree> = commonOp(arrayOf(Token.XOR), this::parseAnd)

    private fun parseOr(): Tree = common(this::parseXor, this::parseOr1)

    private fun parseOr1(): ArrayDeque<Tree> = commonOp(arrayOf(Token.OR), this::parseXor)

    fun parse(): Tree {
        lexer.nextToken()
        return parseOr().also { assert(lexer.lastToken == Token.END) }
    }
}