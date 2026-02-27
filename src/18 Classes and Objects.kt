fun main() {
    val vehicle1 = Vehicle("Terrano", 4, 40000)
    val vehicle2 = Vehicle("i20", 4, 25000)
    val vehicle3 = Vehicle("Hunter 350", 2, 4500)

    vehicle1.startVehicle()
    vehicle2.startVehicle()
    vehicle3.startVehicle()

    println()
    println("Vehicle 1 name is ${vehicle1.name}")
    println("Vehicle 2 has ran ${vehicle2.kmRan} KM")
    println("Vehicle 3 has ${vehicle3.noOfWheels} wheels")
    println()

    vehicle1.applyBrakes()
    vehicle2.applyBrakes()
    vehicle3.applyBrakes()
}

class Vehicle(val name: String, val noOfWheels: Int, var kmRan: Int) {
    fun startVehicle() {
        println("$name's ignition is On")
    }

    fun applyBrakes() {
        println("Brakes applied on $name")
    }
}