import java.io.BufferedReader

enum class Token(val string: String? = null) {
    NOT_IN("not in"),
    LP("("),
    RP(")"),
    AND("and"),
    OR("or"),
    XOR("xor"),
    IN("in"),
    NOT("not"),
    VAR,
    END,
}

class Lexer(private val reader: BufferedReader) {
    lateinit var lastVar: String
        private set

    lateinit var lastToken: Token
        private set

    fun nextToken(): Token {
        return run(fun(): Token {
            var current: Int
            do {
                reader.mark(1)
                current = reader.read()
                if (current == -1) {
                    return Token.END
                }
            } while (current.toChar().isWhitespace())

            reader.reset()
            reader.mark(TOKEN_MAX_LENGTH + 1)

            for (token in Token.values()) {
                reader.reset()
                if (token.string == null) {
                    continue
                }

                val fits = run fits@{
                    token.string.all { c ->
                        if (reader.read() == c.toInt()) true
                        else return@fits false
                    }
                }

                if (fits) {
                    return token
                }
            }

            val character = reader.read().toChar()
            if (character.isLetter()) {
                lastVar = character.toString()
                return Token.VAR
            }
            throw RuntimeException("Unexpected character")
        }).also { token -> lastToken = token }
    }

    companion object {
        const val TOKEN_MAX_LENGTH = 6
    }
}