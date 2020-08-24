package chap02.section3.LocalReturn

// 비지역 반환
fun main() {
    shortFunc(3) {
        println("First call: $it")
        return // 의도 하지 않은 반환
    }
}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()") // 문장은 실행되지 않음.
}
