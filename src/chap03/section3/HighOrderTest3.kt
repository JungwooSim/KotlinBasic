package chap03.section3

fun main() {
    // 반환값이 없는 람다식 선언
    val out: () -> Unit = { println("Hello World!") }
    // 추론 가능하므로 수정 가능 Ex. val out = { println("Hello World!") }
    out()

    // 람다식을 할당해서 재사용 가능
    val new = out
    new ()

    // 다른 함수의 참조에 의한 호출
    println(funcParam(3, 2, ::sum3))
}

fun sum3(x: Int, y: Int) = x + y

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}
