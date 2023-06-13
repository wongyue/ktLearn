import java.util.*

interface Ts {
    fun draw() {}
}

open class Base(name: String) {
    init {
        println("Initializing Base")
    }

    open val size: Int = name.length.also { println("Initializing size in Base: $it") }

    open fun draw() {}
}


class Derived(
    name: String,
    lastName: String,
) : Base(name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    .also { println("Argument for Base: $it") }), Ts {

    init {
        println("Initializing Derived")
    }

    override val size: Int = (lastName.length + super.size).also { println("Initializing size: $it") }
    override fun draw() {
        super<Base>.draw()
        super<Ts>.draw()
    }

    companion object Factory {
        fun create(
            name: String = "张三",
            lastName: String = "222222",
        ): Derived = Derived(name, lastName)
    }
}

abstract class Ming(s: String = "Ming") : Base(s) {
    abstract override fun draw()
}