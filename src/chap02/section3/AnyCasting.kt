package chap02.section3

fun main() {
    var a: Any = 1

    a = 20L
    println("a: $a type: ${a.javaClass}")

    a = 30
    println("a: $a type: ${a.javaClass}")

}
