fun main() {
    val smallCar1 = Automobile2("Car", "Petrol") // Secondary constructor called
    val smallCar2 = Automobile2("Car", "Diesel") // Secondary constructor called
    val bigCar1 = Automobile2("Car", 4, 7, "Diesel") // Primary constructor called
}

class Automobile2(var name: String, var noOfTyres: Int, var maxSeating: Int, engineType: String) {
    // Since most of the car will be having 4 wheels and 5 seating, so we can make a secondary constructor.
    constructor(name: String, engineType: String) : this(name, 4, 5, engineType)
}