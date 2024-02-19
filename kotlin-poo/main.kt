fun printPersonList(vararg persons: String) {
	for (p in persons) println(p)
}

fun main() {
	printPersonList("ana", "jose", "maria", "osvaldo", "berenice")
}
