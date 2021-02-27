private fun collect(root: Tree, id: Int = 1, container: ArrayList<String>): Int {
    container.add(String.format("node_%d [shape=oval, label=\"%s\"]", id, root.string))

    var visitedCount = 0
    for (child in root.children) {
        val childId = id + visitedCount + 1
        visitedCount += collect(child, childId, container)
        container.add(String.format("node_%d -> node_%d;", id, childId))
    }

    return visitedCount + 1
}

fun main() {
    val parser = Parser(System.`in`.bufferedReader())
    val tree: Tree = parser.parse()

    val lines = ArrayList<String>()
    collect(tree, 1, lines)

    println("digraph {")
    lines.forEach { str -> println(str) }
    println("}")
}