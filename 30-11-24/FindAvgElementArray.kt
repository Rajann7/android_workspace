fun main() {
    val numbers = intArrayOf(10, 20, 30, 40, 50)
    val sum = numbers.sum()
    val average = sum.toDouble() / numbers.size

    println("Average of array elements: $average")
}
