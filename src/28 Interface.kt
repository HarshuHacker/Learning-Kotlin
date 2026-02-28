// Interface is used to group object based on what they can do rather than what they are
// It is used to use polymorphism in unrelated set of classes (i.e. classes, which do not belong to same inheritance hierarchy).
// It is a contract which states that whoever implements that interface has to provide the implementation for the methods
// Interfaces are meant for behaviors. Classes which exhibits that behavior implements that interface.
// Interface can have both abstract and concrete methods.
// Interface can implement other interfaces and one class can implement many interfaces, but classes can only have one superclass.

fun main() {
    dragObjects(arrayOf(Circle2(2.0), Square2(3.0), Triangle2(2.0, 3.0), Player("Ross")))
}

fun dragObjects(objects: Array<Draggable>) {
    for (obj in objects) {
        obj.drag()
    }
}

interface Draggable {
    fun drag()
}

abstract class Shape2 : Draggable {
    abstract fun area(): Double
}

class Circle2(val radius: Double) : Shape2() {
    override fun area(): Double {
        return 3.14 * radius * radius
    }

    override fun drag() {
        println("Circle is Dragging")
    }
}

class Square2(val side: Double) : Shape2() {
    override fun area(): Double {
        return side * side
    }

    override fun drag() {
        println("Square is Dragging")
    }
}

class Triangle2(val base: Double, val height: Double) : Shape2() {
    override fun area(): Double {
        return 0.5 * base * height
    }

    override fun drag() {
        println("Triangle is Dragging")
    }
}

class Player(val name: String) : Draggable {
    override fun drag() {
        println("$name is Dragging")
    }
}

// Output

// Circle is Dragging
// Square is Dragging
// Triangle is Dragging
// Ross is Dragging