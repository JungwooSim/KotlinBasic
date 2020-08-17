import java.lang.Integer.parseInt

fun main(args: Array<String>) {
    // Traditional usage
    var a: Int = 10;
    var b: Int = 20;

    var max = a;
    if (a < b) max = b;

    if (a > b) {
        max = a;
    } else {
        max = b;
    }

    // As expression
    max = if (a > b) a else b;

    max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }

    // when
    var x: Int = 1;
    when (x) {
        1 -> println("x == 1");
        2 -> println("x == 1");
        else -> { // Note the block
            println("x is neither 1 nor 2")
        };
    }

    x = 2;
    when (x) {
        0,1 -> println("x == 0 or x == 1");
        else -> println("otherwise");
    }

    var s: String = "2";
    when (x) {
        parseInt(s) -> println("s encodes x");
        else -> println("s does not encode x");
    }

    x = 23;
    var validNumbers: Array<Int> = arrayOf(21,22,23,24);
    when (x) {
        in 1..10 -> println("x is in the range");
        in validNumbers -> println("x is valid");
        !in 10..20 -> println("x is outside the range");
        else -> println("none of the above");
    }

//    when {
//        x.isOdd() -> println("x is odd");
//        y.isEven() -> println("y is even");
//        else -> print("x+y is even.");
//    }
    println(hasPrefix("prefix"));

    // For Loops
    var collection: Array<Int> = arrayOf(1,2,3,4,5);
    for (item in collection) println(item);

    for (item: Int in collection) {
        println(item);
    }

    for (i in 1..3) {
        println(i);
    }

    for (i in 6 downTo 0 step 2) {
        println(i);
    }

    // key 값 출력
    for (i in collection.indices) {
        println(collection[i]);
    }

    // key, value 출력
    for ((index, value) in collection.withIndex()) {
        println("the element at $index is $value");
    }

    // While Loop
    while (x > 0) {
        println(x);
        x--;
    }

//    do {
//        val y = retrieveData();
//    } while (y != null);
}

// 반환타입을 적지 않으면 boolean 값이 리턴된다.
fun hasPrefix(x : Any) = when(x) {
    is String -> x.startsWith("prefix");
    else -> false;
}

// 1.3 버전 이후로 나온 문법.
//fun Request.getBody() =
//        when (val reponse = executeRequest()) {
//            is Success -> response.body;
//            is Httperror -> throw HttpException(response.status);
//        }
