fun main() {
    addition(2, 3)
    addition(2, 3, 4)
}

fun addition(a: Int, b: Int, c: Int = 1) {
    println("Addition called with a=$a, b=$b, c=$c")
}

// Output
// Addition called with a=2, b=3, c=1
// Addition called with a=2, b=3, c=4