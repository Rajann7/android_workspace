open class OverloadExample {
    fun display(message: String) {
        println("Message: $message")
    }

    fun display(number: Int) {
        println("Number: $number")
    }

    fun display(message: String, number: Int) {
        println("Message: $message, Number: $number")
    }
}

fun main() {
    val example = OverloadExample()
    example.display("Hello")         // Calls display with a String parameter
    example.display(123)             // Calls display with Int parameter
    example.display("Hello", 123)    // Calls display with both a String and Int parameter
}
