open class Grandparent {
    fun showGrandparent() {
        println("This is the grandparent class.")
    }
}

open class Parent : Grandparent() {
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
    child.showGrandparent()
    child.showParent()
    child.showChild()
}
