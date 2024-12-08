import java.io.FileInputStream
import java.io.ObjectInputStream

fun main()
{
    var readfile=FileInputStream("D:\\GitHub\\Android_Task\\Person.txt")
    var read=ObjectInputStream(readfile)
    var p :Person1 = read.readObject() as Person1

    println("Person Name: ${p.name}")
    println("Person Age: ${p.age}")
}
