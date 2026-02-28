fun main() {
    val circle = Circle3(2.0)
    val player = Player3("John")

    val arr = arrayOf(circle, player)
    for (obj in arr) {
        if (obj is Circle3) { // This is called Type Checking
            obj.area() // This is smart casting. Since we have added a check above, all the properties of the Circle class is available here.
        } else {
            (obj as Player3).drag() // This is called Explicit type casting
        }
    }
}

interface Draggable3 {
    fun drag()
}

abstract class Shape3 : Draggable3 {
    abstract fun area(): Double
}

class Circle3(val radius: Double) : Shape3() {
    override fun area(): Double {
        return 3.14 * radius * radius
    }

    override fun drag() {
        println("Circle is Dragging")
    }
}

class Player3(val name: String) : Draggable3 {
    override fun drag() {
        println("$name is Dragging")
    }
}

// Output

// John is Dragging