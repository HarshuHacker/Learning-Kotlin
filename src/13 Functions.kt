fun main() {
    println("Sum = ${sum1(10, 20)}")
    println("Sum = ${sum2(30, 40)}")
    println("Sum = ${sum3(50, 60)}")
    println("Sum = ${sum3(70)}") // here if we don't pass the second number as argument, it will take the default value.
}

// Normal Function
fun sum1(a: Int, b: Int): Int { // the parameters are of val type
    // a = 20 // 'val' cannot be reassigned.
    return a + b
}

// Inline Functions
fun sum2(a: Int, b: Int) = a + b

// Default Parameter
fun sum3(a: Int, b: Int = 10) = a + b // here we have defined the default parameter.