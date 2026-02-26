fun main() {
    val marksAbove70 = false
    val knowsProgramming = true

    println("Called For Interview:")

    // AND Operator
    var calledForInterview = marksAbove70 && knowsProgramming
    println("Other Companies: $calledForInterview") // false

    // OR Operator
    calledForInterview = marksAbove70 || knowsProgramming
    println("RSL: $calledForInterview") // true

    // NOT Operator
    println("Marks Less Than 70: ${!marksAbove70}") // true
}