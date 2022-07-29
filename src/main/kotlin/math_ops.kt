import kotlin.math.roundToInt

fun main() {
    var five: Int = 5
    println(five.plus(10))
    println(five.minus(10))
    println(five.times(10))
    println(five.div(10))
    println(five.toString())
    println(five.toDouble())
    println(97.toChar()) // a = 97 ( ASCII value)
    println('a'.code) // a = 97 ( ASCII value)
    println('a'.toInt()) // same as above statement, but char.toInt() is deprecated.
    var x = noReturnType()
    println(x) // prints kotlin.Unit
    println("Area of rectangle with l=2, breadth=4 is " + areaOfRectangle(2, 4))
    println("Area of rectangle " + areaOfRectangle(2.5, 6)) //
    println("Area of rectangle " + areaOfRectangle(6, 4.8).roundToInt()) //

    println("Area of circle with radius 3.0 is: " + areaOfCircle(3.0))
    println("Area of circle with default argument " + areaOfCircle()) // default argument is taken
}

fun noReturnType() {} // default return type is 'Unit', in java no return type means void.

// function with default arguments, if nothing is passed, then the default arguments will overtake.
fun areaOfRectangle(length: Int = 10, breadth: Int = 6): Int {
    return length * breadth
}

fun areaOfRectangle(length: Double = 10.5, breadth: Int = 6): Double {
    return length * breadth
}
/* overloaded function */
fun areaOfRectangle(length: Int = 10, breadth: Double = 6.0): Double {
    return length * breadth
}

fun areaOfCircle(radius: Double = 4.0): Double {
    return Math.PI * radius * radius
}