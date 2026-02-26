fun main() {
    val number = 2
    var index = 1
    while (index <= 10) {
        // println(number.toString() + "*" + index + "=" + (number * index))
        // String Templating
        println("$number * $index = ${number * index}")
        index++
    }
    println("END")
}

// Output

// 2 * 1 = 2
// 2 * 2 = 4
// 2 * 3 = 6
// 2 * 4 = 8
// 2 * 5 = 10
// 2 * 6 = 12
// 2 * 7 = 14
// 2 * 8 = 16
// 2 * 9 = 18
// 2 * 10 = 20
//END