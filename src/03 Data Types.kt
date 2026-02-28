fun main() {
    var score: Int = 5
    val temperature: Float = 0.0f
    val isRaining: Boolean = true
    val alphabet: Char = 'a'
    val message: String = "Hello World"

    // score = "abc"
    // Assignment type mismatch: actual type is 'String', but 'Int' was expected.

    var any: Any =
        123 // Any class is the parent of all classes (int, string, double etc). So you can override `Any` type of data with all other types of data
    println(any) // 123
    any = "abc"
    println(any) // abc
    any = 12.24
    println(any) // 12.24
}