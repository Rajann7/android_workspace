interface Parent1 {
    fun showParent1() {
        println("This is Parent1.")
    }
}

interface Parent2 {
    fun showParent2() {
        println("This is Parent2.")
    }
}

class Child : Parent1, Parent2 {
    fun showChild() {
        println("This is the child class.")
    }
}

fun main() {
    val child = Child()
    child.showParent1()
    child.showParent2()
    child.showChild()
}
