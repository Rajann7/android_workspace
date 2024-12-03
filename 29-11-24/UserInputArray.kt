fun main() {


    // Asking the user for the size of the array

    println("Enter the size of the array:")
    val size = readLine()!!.toInt()


    // Creating an array and taking user input for each element

    val numbers = IntArray(size)
    println("Enter $size numbers:")
    for (i in 0 until size) {
        numbers[i] = readLine()!!.toInt()
    }


    // Displaying the array elements

    println("Array elements are:")
    for (num in numbers) {
        println(num)
    }
}
