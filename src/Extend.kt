// 扩展
class Extend {
    fun printType() {
        println("Extend")
    }

    override fun toString(): String {
        return "Extend()"
    }

    companion object {}
}

fun Extend.printType(i: Int) {
    println("extention  $i")
}

fun Extend.printType() {
    println("extention 333")
}

fun Any?.toString(): String {
    if (this == null) {
        return "null"
    }
    return toString()
}

// 伴生对象的扩展
fun Extend.Companion.p() {
    println("Extend.Companion.p()")
}

// 扩展属性
val <T>MutableList<T>.lastIndex: Int
    get() = size - 1

//
open class Base123
class Derived123 : Base123()
open class BaseCaller {
    open fun Base123.printFunctionInfo() {}

    open fun Derived123.printFunctionInfo() {
        println("Derived extension function in BaseCaller")
    }

    fun call(b: Base123) {
        b.printFunctionInfo() // 调⽤扩展函数
    }
}

class DerivedCaller : BaseCaller() {
    override fun Base123.printFunctionInfo() {
        println("Base extension function in DerivedCaller")
    }

    override fun Derived123.printFunctionInfo() {
        println("Derived extension function in DerivedCaller")
    }
}
