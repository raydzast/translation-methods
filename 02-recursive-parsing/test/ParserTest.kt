import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class ParserTest {
    @Test
    fun testOperators() {
        assertEquals(
            Tree("not in", arrayOf(Tree("a"), Tree("b"))),
            Parser("a not in b").parse()
        )
        assertEquals(
            Tree("and", arrayOf(Tree("a"), Tree("b"))),
            Parser("a and b").parse()
        )
        assertEquals(
            Tree("or", arrayOf(Tree("a"), Tree("b"))),
            Parser("a or b").parse()
        )
        assertEquals(
            Tree("xor", arrayOf(Tree("a"), Tree("b"))),
            Parser("a xor b").parse()
        )
        assertEquals(
            Tree("in", arrayOf(Tree("a"), Tree("b"))),
            Parser("a in b").parse()
        )
        assertEquals(
            Tree("not", arrayOf(Tree("b"))),
            Parser("not b").parse()
        )
    }

    @Test
    fun testParenthesis() {
        assertEquals(
            Tree(
                "and", arrayOf(
                    Tree("a"),
                    Tree(
                        "or", arrayOf(
                            Tree(
                                "in", arrayOf(
                                    Tree("b"),
                                    Tree("c")
                                )
                            ),
                            Tree(
                                "xor", arrayOf(
                                    Tree(
                                        "or", arrayOf(
                                            Tree("g"),
                                            Tree("f")
                                        )
                                    ),
                                    Tree("h")
                                )
                            )
                        )
                    )
                )
            ),
            Parser("((a)) and ((b in c) or (g or f) xor h)").parse()
        )
    }

    @Test
    fun testComplex() {
        assertEquals(
            Tree(
                "not in", arrayOf(
                    Tree(
                        "not in", arrayOf(
                            Tree(
                                "and", arrayOf(
                                    Tree("b"),
                                    Tree(
                                        "xor", arrayOf(
                                            Tree("not", arrayOf(Tree("b"))),
                                            Tree("g")
                                        )
                                    )
                                )
                            ),
                            Tree("d")
                        )
                    ),
                    Tree(
                        "not", arrayOf(
                            Tree(
                                "in", arrayOf(
                                    Tree(
                                        "or", arrayOf(
                                            Tree("b"),
                                            Tree("not", arrayOf(Tree("u")))
                                        )
                                    ),
                                    Tree("h")
                                )
                            )
                        )
                    ),
                )
            ),
            Parser("(b and (not b xor g)) not in d not in (not (b or not u) in h)").parse()
        )
    }

    @Test
    fun testWrong() {
        sequenceOf(
            "a and b in g (j j)",
            "and a in g not in b",
            "not not not not not not in g",
            "a xor , a or ))",
            "(abc)",
            "b and () a",
        ).forEach {
            assertFails {
                Parser(it).parse()
            }
        }
    }

    @Test
    fun testRepeatedNot() { // MODIFICATION forbid repeated not
        assertFails {
            Parser("not not a").parse()
        }

        assertFails {
            Parser("not not not not a").parse()
        }

        Parser("not (not a)").parse()
        Parser("not a").parse()
    }
}

