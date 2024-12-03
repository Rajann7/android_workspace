open class Parent {
    open fun show() {
        println("Parent show method")
    }
}

class Child : Parent() {
    override fun show() {
        println("Child show method")
    }
}

fun main() {
    val parent: Parent = Child()
    parent.show()  // Calls the overridden method in the Child class
}
