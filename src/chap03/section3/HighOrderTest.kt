package chap03.section3

fun main() {
    var result1: Int
    var result2: Int

    // 일반 변수에 람다식 할당
    val multi: (Int, Int) -> Int = {x: Int, y: Int -> x * y}

    // 람다식이 할당된 변수는 함수처럼 사용 가능
    result1 = multi(10, 20)
    println(result1)

    val multi2: (Int, Int) -> Int = {x: Int, y: Int ->
        println("x * y") // 2줄이상일때는 마지막 표현식이 반환
        x * y
    }

    // 람다식이 할당된 변수는 함수처럼 사용 가능
    result2 = multi2(10, 20)
    println(result2)

    // 람다식 구성
    val greet: () -> Unit = {println("Hello World!")} // 매게변수 없을때
    val square: (Int)->Int = {x -> x * x} // 반환타입이 정해지지 않을때
    val nestedLambda: () -> () -> Unit = { {println("nested")} } // 람다식안에 람다식

    nestedLambda()()
}
