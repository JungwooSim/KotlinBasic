package chap06.section3

// object 선언 방식은 접근 시점에 객체가 생성된다.
// 그렇기 때문에 생성자 호출을 하지 않으므로 주/부 생성자를 사용할 수 없다.
// 자바에서는 OCustomer.INSTANCE.getName(); 와 같이 접근하여야 한다.
object OCustomer {
    var name = "Kildong"
    fun greeting() = println("Hello World!")
    val HOBBY = Hobby("Basketball")
    init {
        println("Init!")
    }
}

class Hobby(val name: String)

fun main() {
    OCustomer.greeting() // 객체의 접근 시점
    OCustomer.name = "Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)
}
