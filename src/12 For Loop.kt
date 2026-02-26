fun main() {
    print("Range: ")
    for (i in 1..5) {
        print(i) // Range: 12345
    }
    println()
    print("Until: ")

    for (i in 1 until 5) {
        print(i) // Until: 1234
    }

    println()
    print("Step: ")

    for (i in 1..5 step 2) {
        print(i) // Step: 135
    }

    println()
    print("DownTo: ")

    for (i in 5 downTo 1) {
        print(i) // DownTo: 54321
    }

    println()
    print("DownTo with Step: ")

    for (i in 5 downTo 1 step 2) {
        print(i) // DownTo with Step: 531
    }
}