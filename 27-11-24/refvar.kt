open class A {
    open fun refVar() {
        println("A ")
    }
}

class B : A() {
    override fun refVar() {
        println("B ")
    }
}

fun main() {
    val a: A = B()  // Reference variable a pointing to a B object
    a.refVar()  // Calls the overridden method in the B class

    val b: A = A()  // Reference variable b pointing to an A object
    b.refVar()  // Calls the method in the A class
}
