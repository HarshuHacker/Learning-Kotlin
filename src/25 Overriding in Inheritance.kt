fun main() {
    println("iPhone16 is being created")
    val iPhone16 = Apple("iPhone 16")
    iPhone16.display()
    println(iPhone16.toString()) // Calling the Overridden toString method

    println()
    println("ABC is being created")
    val keypadPhone = Mobile("ABC")
    keypadPhone.display()
}

open class Mobile(nameParam: String) {
    init {
        println("Mobile init is called")
    }
    val name: String = nameParam
    open val size: Double = 5.5
    fun makeCall() = println("Make call")
    fun powerOff() = println("Power off")
    open fun display() = println("LCD Display")
}

class Apple(nameParam: String): Mobile(nameParam) {
    init {
        println("Apple init is called")
    }
    override val size: Double = 6.1
    override fun display() {
        super.display() // Calls the parent display method
        println("I have an OLED display")
    }

    override fun toString(): String {
        return "$name Pro Max"
    }
}

// Output

// iPhone16 is being created
// Mobile init is called
// Apple init is called
// LCD Display
// I have an OLED display
// iPhone 16 Pro Max
//
// ABC is being created
// Mobile init is called
// LCD Display