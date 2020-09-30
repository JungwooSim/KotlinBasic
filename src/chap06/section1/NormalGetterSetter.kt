package chap06.section1

// get(), set() 는 기본적으로 생성되는 것이기 때문에 별도로 코드를 작성할 필요는 없다.
// 아래는 보여주기위해 코드를 작성한 것이다.
class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field // id를 가리키는 포인터 라고 이해하면 된다.

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) { // value 는 다른걸로 작성해도 상관 없음.
            field = value
        }
}

fun main() {
    val user1 = User(1, "Killdong", 30)

    user1.age = 35

    println("user1.age = ${user1.age}")
}
