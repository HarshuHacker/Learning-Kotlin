fun main() {
    var fn = ::add
    println("Addition Function Reference: ${fn(2, 1)}")
    fn = ::sub
    println("Subtraction Function Reference: ${fn(2, 1)}")
}

fun add(a: Int, b: Int) = a + b

fun sub(a: Int, b: Int) = a - b

// Output

// Addition Function Reference: 3
// Subtraction Function Reference: 1