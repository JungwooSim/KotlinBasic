package chap06.section2.bylazyobj

class Person(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false // 1. 초기화 확인 용도

    val person : Person by lazy { // 2. lazy를 사용한 person 객체의 지연 초기화
        isPersonInstantiated = true
        Person("Kim", 23) // 3. Lazy 객체로 반환
    }

    val personDelegate = lazy { Person("Hong", 40) } // 4. 위임 변수를 사용한 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}") // 5. 이 시점에서 초기화
    println("personDelegate.value.name = ${personDelegate.value.name}") // 6. 이 시점에서 초기화 (객체 자체가 아니므로 value를 통해 접근)

    println("person Init: $isPersonInstantiated")
    println("personDelegate Ini: ${personDelegate.isInitialized()}")
}

