class info
{
    fun display(num : Int, name : String, data : (Int,String)->Unit)
    {
        data(num,name)
    }
}

fun main()
{
    var i=info()

    var printinfo : (Int, String)->Unit = {no:Int, name:String -> println("$no, $name") }

    i.display(001, "abc", printinfo)
}