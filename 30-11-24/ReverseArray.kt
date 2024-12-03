fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val reversed = numbers.reversedArray()

    println("Reversed array:")
    for (num in reversed) {
        println(num)
    }
}
