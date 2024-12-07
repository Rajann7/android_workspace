package test

open class Person(var name: String, var age: Int)
{
    fun showPerson() {
        println("Person: $name, Age: $age")
    }
}

class Student(name: String, age: Int, var grade: String) : Person(name, age) {
    fun showStudent() {
        println("Student: $name, Age: $age, Grade: $grade")
    }
}

class Teacher(name: String, age: Int, var subject: String) : Person(name, age) {
    fun showTeacher() {
        println("Teacher: $name, Age: $age, Subject: $subject")
    }
}

class School {

    companion object {
        private var totalPeople = 0
    }

    fun addPerson(st:Student)
    {
        totalPeople++
    }

    fun addPerson(te:Teacher)
    {
        totalPeople++
    }

    fun getTotalPeople(): Int {
        return totalPeople
    }

}


fun main()
{



    var s1 = Student("Rajan", 20, "A")
    var s2 = Student("utsav", 20, "A")
    var s3 = Student("price", 20, "A")



    var t1 = Teacher("prakrutiben", 28, "Kotlin")
    var t2 = Teacher("jaydip sir", 28, "SE")
    var t3 = Teacher("devangiben", 28, "Java")


    var sc = School()

    sc.addPerson(s1)
    sc.addPerson(s2)
    sc.addPerson(s3)

    sc.addPerson(t1)
    sc.addPerson(t2)
    sc.addPerson(t3)


    println("\nStudent Name")
    s1.showPerson()
    s2.showPerson()
    s3.showPerson()

    println("\nTeacher Name")

    t1.showPerson()
    t2.showPerson()
    t3.showPerson()

    println("\nTotal People "+sc.getTotalPeople())


}

