fun main() {
    var firstName: String = "John" // this string can't be assigned null value
    var lastName: String? = "Doe" // this string can have null value
    lastName = null
    println("First name is : $firstName")
    println("Last name is : $lastName")
}