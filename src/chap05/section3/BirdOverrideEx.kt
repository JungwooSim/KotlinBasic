package chap05.section3.override

// 상속을 가능하도록 하기 위해 open 사용
open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    fun fly() = println("Fly wing: $wing")

    // Override 가능하도록
    open fun sing(vol: Int) = println("Sing vol: $vol")
}
// 부 생성자를 사용하는 상속
class Parrot : Bird {
    var language: String

    constructor(name: String, wing: Int, beak: String, color: String, language: String) : super(name, wing, beak, color) {
        this.language = language
    }

    override fun sing(vol: Int) {
        println("I'm parrot! The volume level is $vol")
        speak()
    }

    fun speak() = println("Speak! $language")
}

fun main() {
    val parrot = Parrot("myparrot", 2, "short", "multiple", "korean")

    parrot.language = "English"
    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")

    parrot.sing(5)
}
