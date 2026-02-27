fun main() {
    val car = Automobile("Car", 4, 5)
    println("vehicleType -> ${car.vehicleType}")
    println("noOfTyres -> ${car.noOfTyres}")
    println("maxSeating -> ${car.maxSeating}")
    val person = Person("Harsh Prasad", 24)
    println("personName -> ${person.personName}")
    println("personAge -> ${person.personAge}")
}

// Primary Constructor type 1
class Automobile(name: String, var noOfTyres: Int, val maxSeating: Int) {
    // Note: The name parameter does not have val or var, so you can't access it like car.name
    // You will have to assigned it to some variable and the use it
    val vehicleType = name
}

// Primary Constructor type 2
class Person(name: String, age: Int) {
    val personName = name
    val personAge = age
}