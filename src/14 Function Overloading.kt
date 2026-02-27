fun main() {
    addition(1, 2)
    addition(1.0, 2.0)
}

fun addition(a: Int, b: Int) {
    println("Addition 1 called with a=$a, b=$b")
}

fun addition(a: Double, b: Double) {
    println("Addition 2 called with a=$a, b=$b")
}

// Output
//Addition 1 called with a=1, b=2
//Addition 2 called with a=1.0, b=2.0