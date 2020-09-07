package chap04.section2

fun main() {
    do {
        print("Enter an integer: ")
        val input = readLine()!!.toInt()

        for (i in 0..(input-1)) {
            // until 사용 가능 (위처럼도 가능)
            for (j in 0 until input) print((i+j) % input + 1)
            println()
        }
    } while (input != 0)
}
