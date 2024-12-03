fun main()
{

    var num1 = 10
    var num2 = 5

    var choice = 4

    println("1. Addition 2. Subtraction 3. Multiplication 4. Division")

    when(choice){

        1 -> println(num1+num2)
        2 -> println(num1-num2)
        3 -> println(num1*num2)
        4 -> println(num1/num2)

    }

}