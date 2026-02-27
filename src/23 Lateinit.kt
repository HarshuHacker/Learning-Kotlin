fun main() {
    val ob = Calculator()
    println("Addition -> ${ob.add(2, 3)}")
    println("Multiplication -> ${ob.multiply(2, 3)}")
}

class Calculator {
    // lateinit is used if you want to initialize the variable later on. Note: lateinit must be used with var only.
    lateinit var message: String
    fun add(a: Int, b: Int): Int {
        // println("message -> $message") // lateinit property message has not been initialized
        return a + b
    }

    fun multiply(a: Int, b: Int): Int {
        message = "Hi Harsh"
        println("message -> $message")
        return a * b
    }
}