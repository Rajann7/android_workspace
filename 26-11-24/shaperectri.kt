open class Shape {
    var a: Int = 10
    var b: Int = 5
}

class Rectangle : Shape() {
    fun RectangleArea() {
        var area = a * b
        println("The area of the rectangle is: $area")
    }
}

class Triangle : Shape() {
    fun TriangleArea() {
        var area = (a * b) / 2
        println("The area of the triangle is: $area")
    }
}

fun main() {
    var r = Rectangle()
    r.RectangleArea()

    var t = Triangle()
    t.TriangleArea()
}
