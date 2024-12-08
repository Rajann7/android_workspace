import java.io.FileOutputStream
import java.io.ObjectOutputStream
import java.io.Serializable

class Person1(var name: String, var age: Int) : Serializable

fun main() {
    println("Enter Person Name: ")
    var name = readln()
    println("Enter Person Age: ")
    var age = readln().toInt()

    var person = Person1(name, age)
    var writeFile = FileOutputStream("D:\\GitHub\\Android_Task\\Person.txt")
    var write = ObjectOutputStream(writeFile)
    write.writeObject(person)

    println("File Creation... Success!!!")
}
