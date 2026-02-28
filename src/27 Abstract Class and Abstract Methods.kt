// Abstract class can't be instantiated
// Abstract class can have both abstract and non-abstract properties and methods.
// If a class has abstract method of property, then class must be declared as abstract

fun main() {
    val circle = Circle1(2.0)
    circle.display()
}

abstract class Shape1 {
    abstract var name: String
    var isVisible: Boolean = false
    abstract fun area(): Double
    abstract fun display()
}

class Circle1(val radius: Double) : Shape1() {
    override var name: String = "Circle"
    override fun area(): Double {
        return 3.14 * radius * radius
    }

    override fun display() {
        println("Displaying a circle with radius $radius")
        isVisible = true
        println("The area of the circle is visible: $isVisible")
    }
}

// Output

// Displaying a circle with radius 2.0
// The area of the circle is visible: true