package collections

fun main() {
    // Read-only set
    val readOnlyFruits = setOf("apple", "banana", "cherry", "cherry")
    println(readOnlyFruits) // [apple, banana, cherry]

    println("This set has ${readOnlyFruits.count()} items")
    println("banana" in readOnlyFruits) // true

    println()

    // Mutable set with explicit type declaration
    val fruits: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    println(fruits) // [apple, banana, cherry]

    val fruitsLocked: Set<String> = fruits
    fruits.add("orange")
    println(fruitsLocked) // [apple, banana, cherry, orange]

    fruits.add("dragonfruit")
    println(fruits) // [apple, banana, cherry, orange, dragonfruit]

    fruits.remove("dragonfruit")
    println(fruits) // [apple, banana, cherry, orange]
}


