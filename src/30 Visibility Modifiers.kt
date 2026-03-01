// Top Level Declaration

// public - everywhere
// internal - with in a module
// protected - N/A
// private - with in the file

// Class Members

// public - everywhere
// internal - with in a module
// protected - in its subclasses
// private - with in the class

fun main() {
    val objA = A()
    val objB = B()

    println(objA.a)
    println(objB.b)
    // println(objA.c) // Not accessible since its protected
    // println(objB.d) // Not accessible since its private
}

open class A {
    public var a = 10 // By default, everything is public
    internal var b = 10
    protected var c = 10
    private var d = 10
}

class B : A() {
    fun test() {
        println(a)
        println(b)
        println(c)
        // println(d) // Not accessible to the child since its private
    }
}