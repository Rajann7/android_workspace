class Student(val name: String, val enrNum: Int) {

    companion object {
        const val college = "ABC"
        fun displayCollege() {
            println("College Name: $college")
        }
    }

    fun displayDetails() {
        println("Name: $name")
        println("Enrollment Number: $enrNum")
    }
}

fun main() {
    print("Enter Your Name: ")
    val name = readln()

    print("Enter Your Enrollment Number: ")
    val enrNum = readln().toInt()

    val student1 = Student(name, enrNum)
    student1.displayDetails()
    Student.displayCollege()

    val student2 = Student("abc", 11543)
    student2.displayDetails()
    Student.displayCollege()
}
