package chap05.section1.constructor2

// 주 생성자 - 방법1
//class Bird constructor(_name: String, _wing: Int, _beak: String, _color: String) {
//    var name: String = _name
//    var wing: Int = _wing
//    var beak: String = _beak
//    var color: String = _color

// 주 생성자 - 방법2
class Bird constructor(var name: String, var wing: Int, var beak: String, var color: String) {
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird("mybird", 2, "short", "blue")
//    val coco2 = Bird("mybird", "short")

    println("coco.name : ${coco.name}")
    println("coco.color : ${coco.color}")

    coco.fly()
    coco.sing(3)

    println("-----------------")

//    println("coco.name : ${coco2.name}")
//    println("coco.color : ${coco2.color}")
//
//    coco2.fly()
//    coco2.sing(3)
}
