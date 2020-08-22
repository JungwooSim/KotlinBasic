package chap03.section1

fun main() {
    normalVarargs(1,2,3,4)
    normalVarargs(1,2,3)
}

// 인수의 수를 가변적으로 받을 수 있음
fun normalVarargs(vararg counts: Int) {
    for (num in counts) {
        println("$num")
    }
}
