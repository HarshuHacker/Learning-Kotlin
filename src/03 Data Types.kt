fun main() {
    var score: Int = 5
    val temperature: Float = 0.0f
    val isRaining: Boolean = true
    val alphabet: Char = 'a'
    val message: String = "Hello World"

    // score = "abc"
    // Assignment type mismatch: actual type is 'String', but 'Int' was expected.

    var anyDataType: Any =
        123 // Any is the parent of all classes (int, string, double etc). So you can override `Any` with any type of data
    println(anyDataType) // 123
    anyDataType = "abc"
    println(anyDataType) // abc
    anyDataType = 12.24
    println(anyDataType) // 12.24
}