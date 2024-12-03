class E
{
    fun d(n: String, e: Int, p: Int)
    {
        println("Name : $n")
        println("Employee Number : $e")
        println("Mobile Number : $p")
    }
}

fun main()
{
    val x = E()

    x.d(n = "abc", p = 78451298, e = 11)
}
