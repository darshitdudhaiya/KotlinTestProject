fun main() {
    val animal = "Dog"

    val result = when (animal) {
        "Dog" -> "Animal is Dog"
        "Cat" -> "Animal is Cat"
        else -> "Animal is Unknown"
    }

    println(result)
}