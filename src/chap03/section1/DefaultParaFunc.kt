package chap03.section1

fun main() {
    add("big")
    add("big", "gmail")

    add2()

    // named parameter
    add2(email="gmail")
}

fun add(name: String, email: String = "default"):Unit {
    println("name: $name , email : $email")
}

fun add2(name: String = "big", email: String = "default"):Unit {
    println("name: $name , email : $email")
}


