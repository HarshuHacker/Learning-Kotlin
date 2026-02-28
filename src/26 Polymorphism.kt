fun main() {
    val shapes: Array<Shape> = arrayOf(Circle(3.0), Triangle(3.0, 4.0), Square(5.0))
    for (shape in shapes) {
        println(shape.area())
    }
}

open class Shape() {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(var radius: Double) : Shape() {
    override fun area(): Double {
        return 3.1415926 * radius * radius
    }
}

class Triangle(var base: Double, var height: Double) : Shape() {
    override fun area(): Double {
        return 0.5 * base * height
    }
}

class Square(var side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

// Output

// 28.274333400000003
// 6.0
// 25.0