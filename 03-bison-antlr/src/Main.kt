import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main() {
    val stream = CharStreams.fromStream(System.`in`)
    val lexer = SlylangLexer(stream)
    val parser = SlylangParser(CommonTokenStream(lexer))
    print(parser.file().cpp)
}
