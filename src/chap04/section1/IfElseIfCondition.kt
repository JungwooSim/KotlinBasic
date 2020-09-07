package chap04.section1

fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble() // 콘솔로 값을 입력 받음
    var grade: Char = 'F'

    if (score >= 90.0) {
        grade = 'A'
    } else if (score in 80.0..89.9) { // 시작과 끝값은 포함 (이상, 이하)
        grade = 'B'
    } else if (score in 70.0..79.9) {
        grade = 'C'
    }

    println("Score : $score, Grade : $grade")
}
