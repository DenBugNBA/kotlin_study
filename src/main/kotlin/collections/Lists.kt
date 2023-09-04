package collections

fun main() {
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes) // [triangle, square, circle]

    println("The first item in the list is: ${readOnlyShapes[0]}")

    println("The first item in the list is: ${readOnlyShapes.first()}")
    println("The last item in the list is: ${readOnlyShapes.last()}")

    println("This list has ${readOnlyShapes.count()} items")

    println("circle" in readOnlyShapes) // true

    println()

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes) // [triangle, square, circle]

    // casting to read-only
    val shapesLocked: List<String> = shapes

    shapes.add("rectangle")
    println(shapesLocked) // [triangle, square, circle, rectangle]

    shapes.add("pentagon")
    println(shapes)

    shapes.remove("pentagon")
    println(shapes)
}
