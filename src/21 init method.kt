fun main() {
    val car1 = Vehicle2("Terrano", "Diesel", 5)
    println("All the init gets executed first as soon as the object is created.")
    car1.horn()
}

class Vehicle2(name: String, engineType: String, maxSeating: Int) {
    init {
        println("Vehicle is starting")
    }

    fun horn() {
        println("Vehicle is honking")
    }

    init {
        println("Vehicle is stopping")
    }
}

// Output

// Vehicle is starting
// Vehicle is stopping
// All the init gets executed first as soon as the object is created.
// Vehicle is honking