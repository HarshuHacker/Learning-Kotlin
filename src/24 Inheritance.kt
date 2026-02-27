fun main() {
    val childObj = Child()
    println(childObj.name1)
    println(childObj.name2)
    childObj.myMethod1()
    childObj.myMethod2()
}

open class Parent() { // The parent class must be marked as open so that it can be inherited.
    init {
        // Parent init is called before child init
        println("Parent init is called")
    }

    val name1: String = "Parent"
    fun myMethod1() {
        println("I am in Parent")
    }
}

class Child : Parent() { // You can inherit from a single parent only
    init {
        println("Child init is called")
    }

    val name2: String = "Child"
    fun myMethod2() {
        println("I am in Child")
    }
}

// Output

// Parent init is called
// Child init is called
// Parent
// Child
// I am in Parent
// I am in Child