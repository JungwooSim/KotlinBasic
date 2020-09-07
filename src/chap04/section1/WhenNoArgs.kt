package chap04.section1

fun main() {
    print("Enter the score:")
    var score = readLine()!!.toDouble()
    var grade: Char = 'F'
    var score2 = 50.0;
    var grade2: Char = 'F'

    when {
        score >= 90.0 -> grade = 'A'
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        score2 == 50.0 -> grade2 = 'P'
        score < 70.0 -> grade = 'F'
    }

    println("Score: $score, Grade: $grade, Score2: $score2, Grade2: $grade2")
}
