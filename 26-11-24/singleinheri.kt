open class Parent {
    fun showParent() {
        println("This is the parent class.")
    }
}

class Child : Parent() {
    fun showChild() {
        println("This is the child class.")
    }
}

fun main() {
    val child = Child()
    child.showParent()
    child.showChild()
}
