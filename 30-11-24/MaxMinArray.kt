fun main() {
    val numbers = intArrayOf(10, 5, 8, 1, 12)
    var max = numbers[0]
    var min = numbers[0]

    for (num in numbers) {
        if (num > max) max = num
        if (num < min) min = num
    }

    println("Maximum value: $max")
    println("Minimum value: $min")
}
