import org.junit.Test
import java.io.BufferedReader
import java.io.StringReader
import kotlin.test.assertEquals
import kotlin.test.assertFails

class LexerTest {
    @Test
    fun testAllTokens() {
        val lexer =
            Lexer(
                BufferedReader(
                    StringReader(
                        "A    \t and \t\t   and or xor in not in not B b) (c g and (b t o)"
                    )
                )
            )
        val tokens = arrayOf(
            Token.VAR,
            Token.AND,
            Token.AND,
            Token.OR,
            Token.XOR,
            Token.IN,
            Token.NOT_IN,
            Token.NOT,
            Token.VAR,
            Token.VAR,
            Token.RP,
            Token.LP,
            Token.VAR,
            Token.VAR,
            Token.AND,
            Token.LP,
            Token.VAR,
            Token.VAR,
            Token.VAR,
            Token.RP,
            Token.END
        )
        for (token in tokens) {
            assertEquals(token, lexer.nextToken())
        }
    }

    @Test
    fun testVars() {
        val vars = CharRange('a', 'z')
        for (name in vars) {
            val lexer = Lexer(BufferedReader(StringReader("$name")))
            assertEquals(Token.VAR, lexer.nextToken())
            assertEquals("$name", lexer.lastVar)
        }
    }

    @Test
    fun testWrong() {
        val lexer = Lexer(BufferedReader(StringReader("a b c and () something &&7fas wrong")))
        assertFails {
            while (true) {
                lexer.nextToken()
            }
        }
    }
}