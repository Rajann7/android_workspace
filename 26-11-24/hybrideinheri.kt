open class A {
    fun showParent() {
        println("This is the parent class.")
    }
}

class B : A() {
    fun showB() {
        println("This is class B.")
    }
}

class C : A() {
    fun showC() {
        println("This is class C.")
    }
}

fun main() {
    val b = B()
    b.showParent()
    b.showB()

    val c = C()
    c.showParent()
    c.showC()
}
