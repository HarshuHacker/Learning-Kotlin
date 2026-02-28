fun main() {
    val age18Plus = false
    val knowsDriving = true

    println("Called For Interview:")

    // AND Operator
    val canApplyForDL = age18Plus && knowsDriving
    println("Can Apply For DL: $canApplyForDL") // false

    val hasBike = false
    val hasCar = true

    // OR Operator
    val hasVehicle = hasBike || hasCar
    println("Has Vehicle: $hasVehicle") // true

    // NOT Operator
    println("Age Less than 18: ${!age18Plus}") // true
}