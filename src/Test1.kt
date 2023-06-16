import java.util.*


fun maxOf(a: Int, b: Int = 10): Int? {
    if (a is Int) {

    }
    if (a > b) return a
    else return b
}

fun des(obg: Any): String = when (obg) {
    1 -> "One"
    "Hello" -> "Greeting"
    is Long -> "Long"
    !is String -> "Not a string"
    else -> "Unknown"
}

fun inTest(x: Int) {
    if (x in 1..20) {
        println(x)
    } else {
        println("x in 1..20 = false")
    }
}

fun forInTest() {
    for (x in 10 downTo 0 step 2) {
        println(x)
    }
}

fun list() {
    val list = listOf("a", "b", "c")
    for (item in list) {
        print(item)
    }
}

fun list2() {
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits.filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase(locale = Locale.getDefault()) }
        .forEach { println(it) }
}

fun ex() {
    var a = 1
    var b = 6
    println("$a -- $b")
    a = b.also { b = a }
    println("$a -- $b")
    TODO("asdasdasdasd ")
}

fun main() {
    printAllValues<RGB>()
}

class C {
    private val _elm = listOf(1, 2, 3)

    private val elmList: List<Int>
        get() = _elm

    override fun toString(): String {
        return super.toString()
    }

    fun test() {
        for (item in elmList) {
            print(item)
        }
    }
}

fun ex2() {
    val s = listOf(1, 2, 3)
    s.forEach {
        if (it == 2) {
            println(it * 2)
            return@forEach
        }
        println(it)
    }
}

enum class Des {
    TOP,
    DOWN,
    LEFT,
    RIGHT,
}