fun main()

{

    println("Enter a Single Char ")
    var char = readln().toString()

    if (char.length != 1) {
        println("Input only Single Char")
    }

    else if (char in "aeiouAEIOU")
    {
        println("$char is a Vowel")
    }

    else if (char in "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ") {

        println("$char is a Consonant")

    }

    else

    {
        println("$char is an Invalid char")

        }




    }

