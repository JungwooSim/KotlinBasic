package chap03.section3.paramCount

fun main() {
    // 매게변수 없는 람다식 함수
    noParam({ "Hello World" })
    noParam { "Hello World" } // 매게변수없을때 소괄호 생략 가능

    // 매게변수가 하나 있는 람다식
    oneParam({ a -> "Hello World! $a" })
    oneParam { a -> "Hello World! $a" }
    oneParam { "Hello World! $it" } // 매게변수가 1개일때, "a->" 대신 $it 으로 대체가능, 테스트해보니 다른건 안되는듯 싶음

    // 매게변수가 두개 있는 람다식
    moreParam { a, b -> "Hello World! $a $b"}
    moreParam { _, b -> "Hello World! $b"} // "_" 사용하면 해당 번째의 매게변수 생략 가능

}

fun noParam(out: () -> String) = println(out())

fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}
