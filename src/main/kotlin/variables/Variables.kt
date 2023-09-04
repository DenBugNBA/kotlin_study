package variables

fun main() {
    // read-only variable
    val popcorn = 5
    println(popcorn)

    // mutable variables
    var customers = 10
    customers++

    // string templates
    println("There are $customers customers")
    println("There will be ${customers + 1} customers")

    // Variable declared without initialization
    val d: Int

    // Variable 'd' must be initialized
    //    println(d)

    // Variable initialized
    d = 3
    println(d) // 3

    // Variable explicitly typed and initialized
    val e: String = "hello"
    println(e)

    val floatNum: Float = 3.14F
    val doubleNum: Double = 3.14

    println(floatNum)
    println(doubleNum)
}
