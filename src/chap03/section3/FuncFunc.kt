package chap03.section3

fun main() {
    println("funcFunc: ${funcFunc()}")
}

fun sum2(a: Int, b: Int) = a + b

// 함수의 반환값으로 함수 사용
fun funcFunc(): Int {
    return sum2(2,2)
}
