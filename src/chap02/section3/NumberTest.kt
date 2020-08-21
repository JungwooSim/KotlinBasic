package chap02.section3

fun main() {
    var test: Number = 12.2
    println("$test")

    test = 12 // Int 로 스마트 캐스트
    println("$test")

    test = 120L // Long 로 스마트 캐스트
    println("$test")

    test += 12.0f // Float 로 스마트 캐스트
    println("$test")
}
