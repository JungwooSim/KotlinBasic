package chap04.section3.NoInlineLambda

fun main() {
    retFunc()
}

inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc() {
    println("start of retFunc")

    // 라벨 표기법
//    inlineLambda(13, 3) lit@ { a, b ->
//        val result = a + b
//        if(result > 10) return@lit
//        println("result : $result")
//    }
    // 암묵적 라벨 표기법
//    inlineLambda(13, 3) { a, b ->
//        val result = a + b
//        if(result > 10) return@inlineLambda
//        println("result : $result")
//    }

    // 익명 함수
    inlineLambda(13, 3, fun (a,b) {
        val result = a + b
        if(result > 10) return
        println("result : $result")
    })

    println("end of retFunc")
}
