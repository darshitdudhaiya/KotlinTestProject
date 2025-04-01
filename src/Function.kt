fun main() {

    println(add(1, 2))
    println(add(1.0, 2.0))
    println(multiply(b = 2))

    val fn: (a: Double, b: Double) -> Double = ::add
    println(fn(1.0, 2.0))

}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun add(a: Double, b: Double) = a + b

fun multiply(a: Int = 1, b: Int) = a * b