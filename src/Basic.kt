import java.util.*

fun main(args: Array<String>) {
//    primitiveCheck();
//    explicitConversions();


    // Array
    var array: Array<String> = arrayOf("코틀린", "강좌"); // 배열 선언
    var numbers: Array<String> = Array(5, { i -> i.toString() });
    var numbers2: IntArray = intArrayOf(1,2,3); // null이 안들어갈때는 Primitive Type으로 추가하면
    println(array);
    println(array[0]);
    println(array.get(0));
    println(array.size);
    println(Arrays.toString(numbers))

    println("--------")

    // String
    var string: String = "Kotlin";
    println(string.get(0));
    println(string[0]);
    println(string.length);

    for (x in string) {
        println(x);
    }

    println("--------")

    // escaped string
    val s: String = "Hello, world!\n"
    println(s);

    // raw string
    val b: String =
"""
"'이것은 코틀린의
raw String
입니다.
""";
    println(b);
}

fun primitiveCheck() {
    var a: Int = 100000; // primitive type
    var b: Int? = 100000; // object type

    println("a === b : ${a === b}");
    println("a == b : ${a == b}");
}

fun explicitConversions() {
    val a: Int = 1;
    val b: Long = a.toLong();
//    println(a == b); // error

    val i: Int = b.toInt();
    println(a == i);
}
