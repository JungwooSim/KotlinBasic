package chap05.section1.Init

class Bird (var name: String, var wing: Int, var beak: String, var color: String) {
    // 초기화 블록
    init {
        println("----초기화 시작----")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("----초기화 끝----")
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird("mybird", 2, "short", "blue")

    println("coco.name : ${coco.name}")
    println("coco.color : ${coco.color}")

    coco.fly()
    coco.sing(3)
}
