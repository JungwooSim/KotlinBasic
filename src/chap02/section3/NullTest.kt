package chap02.section3

fun main() {
    var str1: String = "Hello Kotlin"
    println("str1: $str1")

    // null 을 사용(허용)하려면 "?" 를 사용해야함
    var str2: String? = null
    println("str2: $str2")

    // NullPointerException Error
//    println("${str2!!.length}")

    // null check
    // Java Example
    var len: Int = if(str2 != null) str2.length else -1
    println("str2 : ${str2} length: ${len}")

    // Kotlin Example
    len = str2?.length ?: -1
    println("str2 : ${str2} length: ${len}")

}
