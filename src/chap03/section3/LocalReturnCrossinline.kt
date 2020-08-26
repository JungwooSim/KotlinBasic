package chap02.section3.LocalReturnCrossinline

// 비지역 반환 금지
fun main() {
    shortFunc(3) {
        println("First call: $it")
        // return (crossinline 으로 return을 못하도록 막음)
    }
}

inline fun shortFunc(a: Int, crossinline out: (Int) -> Unit) {
    println("Before calling out()")
    nestedFunc { out(a) }
    println("After calling out()") // 문장은 실행되지 않음.
}

fun nestedFunc(body: () -> Unit) {
    body()
}
