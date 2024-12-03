fun main() {
    val num1: Int = 25
    val num2: Int = 15

    val maxNum = num1 maxWith num2
    println("The greater number is: $maxNum")
}

infix fun Int.maxWith(other: Int): Int {
    return if (this > other) this else other
}
