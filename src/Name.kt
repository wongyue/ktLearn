interface Name {
    val prop: Int

    val propWithImp: String
        get() = "foo"

    fun bar()

    //类似于 java interface 中的 default 方法定义
    fun foo() {
        println("prop = $prop")
        println("propWithImp = $propWithImp")
    }
}

class Child : Name {
    override val prop: Int = 20

    override fun bar() {
        TODO("Not yet implemented")
    }

    override fun foo() {
        println(65465)
        super.foo()
    }


}