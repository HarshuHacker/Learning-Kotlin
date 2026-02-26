fun main() {
    val number = 5
    println(number in 1..5) // 1, 2, 3, 4, 5 // true
    println(number in 1 until 5) // 1, 2, 3, 4 // false
}