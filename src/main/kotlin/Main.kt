fun main() {
    println("Hello Kotlin!")
    var name: String = "Don Felkar"
    println(name)
    name = "Jitendra Pandey"
    println(name)

    val name2 = "Jit"
    val name3: String = "Jit"
    println(name2)
    println(name3)

   //  name2 = "Sachin" // not allowed, illegal because val means constants.

    val ten : Int = 10;
    val five : Int = 5;
    println(ten * five)

    val a: Byte = 127
    val b: Char = 'x'
    val c: Short = 32767
    val d: Int = 2000000000
    val e: Long = 1_000_000_000_000
    val f: Float = 3.14F
    val g: Double =  2.5
    val h: Boolean = true
    println("""a=$a, b=$b, c=$c, d=$d, e=$e, f=$f, g=$g, h=$h""")
}