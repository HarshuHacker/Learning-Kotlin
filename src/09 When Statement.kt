fun main() {
    val number = 16
    val result = when (number) {
        11 -> "Eleven"
        12 -> "Twelve"
        13 -> "Thirteen"
        14 -> "Fourteen"
        in 15..19 -> "from rest of the teen family"
        else -> "Not from the teen family"
    }
    println("The Number is $result") // The Number is from rest of the teen family
}