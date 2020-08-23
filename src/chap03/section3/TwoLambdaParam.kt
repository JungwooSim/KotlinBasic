package chap03.section3.TwoLambdaParam

fun main() {
    // 마지막 매게변수에 람다식이 포함되어있으면 아래와 같이 분리하여 코드 작성 가능

    twoLambda({a, b -> "First $a $b"}, {"Second $it"})
    twoLambda({a, b -> "First $a $b"}) {"Second $it"} // 위와 동일
}

fun twoLambda(first: (String, String) -> String, second: (String) -> String) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}
