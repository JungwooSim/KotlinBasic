package chap05.section1.constructor

class Bird {
    var name: String
    var wing: Int = 2
    var beak: String
    var color: String = "RED"

    // 부생성자
    constructor(_name: String, _wing: Int, _beak: String, _color: String) {
        name = _name
        wing = _wing
        beak = _beak
        color = _color
    }

    constructor(_name: String, _beak: String) {
        name = _name
        beak = _beak
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird("mybird", 2, "short", "blue")
    val coco2 = Bird("mybird", "short")

    println("coco.name : ${coco.name}")
    println("coco.color : ${coco.color}")

    coco.fly()
    coco.sing(3)

    println("-----------------")

    println("coco.name : ${coco2.name}")
    println("coco.color : ${coco2.color}")

    coco2.fly()
    coco2.sing(3)
}
