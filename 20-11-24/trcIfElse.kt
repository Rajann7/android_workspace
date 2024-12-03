fun main(){

    var choice = 2

    println("Choose option to Calculate area")
    println("1. Triangle")
    println("2. Rectangle")
    println("3. Circle")

    if(choice == 1) {

        var base = 10
        var height = 5
        var triangle = (base * height ) /2
        print("Area of Triangle is: ")
        println(triangle)
    }

    else if (choice == 2) {

        var length = 20
        var width = 10
        var rectangle = length * width
        print("Area of Rectangle is: ")
        println(rectangle)
    }

    else if (choice == 3) {

        val pi = 3.14
        var radius = 10
        var circle = pi * radius * radius
        print("Area of Circle is: ")
        println(circle)
    }

}