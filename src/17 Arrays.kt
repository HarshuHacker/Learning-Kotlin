fun main() {
    val arr = arrayOf("One", "Two", "Three", "Four", "Five")
    for ((index, element) in arr.withIndex()) {
        println("$index -> $element")
        // 0 -> One
        // 1 -> Two
        // 2 -> Three
        // 3 -> Four
        // 4 -> Five
    }

    println()
    println(arr[0]) // One
    println(arr.get(3)) // Four

    arr[2] = "Teen"
    println(arr[2]) // Teen
    arr[3] = "Char"
    println(arr[3]) // Char

    println(arr[8]) // Exception: Index 8 out of bounds for length 5
}