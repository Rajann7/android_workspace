fun main() {
    val fruitMap = mutableMapOf("Apple" to 50, "Banana" to 10)

    println("Initial Fruits: $fruitMap")
    fruitMap["Cherry"] = 25  // Adding new item
    println("After Adding Cherry: $fruitMap")
    fruitMap["Banana"] = 15  // Modifying item
    println("After Updating Banana Price: $fruitMap")
    fruitMap.remove("Apple") // Removing item
    println("After Removing Apple: $fruitMap")
}
