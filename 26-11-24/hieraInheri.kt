open class Parent {
    fun showParent() {
        println("Parent")
    }
}

class ChildOne : Parent() {
    fun showChildOne() {
        println("Child One")
    }
}

class ChildTwo : Parent() {
    fun showChildTwo() {
        println("Child Two")
    }
}

fun main() {
    val x = ChildOne()
    x.showParent()
    x.showChildOne()


    val y = ChildTwo()
    y.showParent()
    y.showChildTwo()
}
