class A
{
    fun s()
    {
        println("I can Speak")
    }
}

fun A.e()
{
    println("I can Eat")
}

fun main()
{
    val x = A()

    x.s()
    x.e()
}
