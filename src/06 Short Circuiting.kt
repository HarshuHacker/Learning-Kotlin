fun main() {
    var a = 10
    var b = 10

    var result = true || a++ == 20 // Here a++ is not executed since the first check is true
    println(a) // 10
    result = false || b++ == 20 // Here b++ is executed since the first check is false
    println(b) // 11
}