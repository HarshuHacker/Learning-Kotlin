fun main() {
    val p1 = Person2("Harsh", 24)
    println(p1.name)
    println(p1.age)
    p1.age = 22
    p1.age = -12
}

class Person2(nameParam: String, ageParam: Int) {
    var name: String = nameParam
        get() {
            return "Name is $field"
        }
        set(value) { // default setter
            field = value
        }
    var age: Int = ageParam
        get() { // default getter
            return field
        }
        set(value) {
            if (value > 0) field = value else println("Age Can't be negative")
        }
}