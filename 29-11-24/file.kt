import java.io.File

fun main() {
    val fileName = "example.txt"

    // Writing the file
    val file = File(fileName)
    file.writeText("Hello, this is a file example in Kotlin")

    // Reading from file
    val content = file.readText()
    println("File content:")
    println(content)
}
