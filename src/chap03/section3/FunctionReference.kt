package chap03.section3

fun main() {
    // 인자와 반환값이 없는 함수
    val res1 = funcParam2(3, 2, ::sum4)
    println(res1)

    // 인자가 없는 함수
    hello(::text)

    // 일반 변수에 값처럼 할당
    val likeLambda = ::sum
    println(likeLambda(6,6))
}

fun sum4(a: Int, b: Int) = a + b

fun text(a: String, b: String) = "HI! %a %b"

fun funcParam2(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}

fun hello(body: (String, String) -> String): Unit {
    println(body("Hello", "World"))
}
