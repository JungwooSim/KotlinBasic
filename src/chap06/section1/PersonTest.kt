package chap06.section1

//class Person(_id: Int, _name: String, _age: Int) {
//    val id: Int = _id // 불변
//    var name: String = _name // 변경가능
//    var age: Int = _age // 변경가능
//}

// 위 코드를 아래와 같이 좀 더 간략화 가능
class Person(val id: Int, var name: String, var age: Int)

fun main() {
    val person = Person(1, "Killdong", 30)

    val name = person.name

    person.age = 41 //setter

    println("name: $name, ${person.age}") //getter
}
