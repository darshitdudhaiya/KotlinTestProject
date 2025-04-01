fun main() {
    var i: Int = 10
    var j: Int = 15

    // Arithmetic Operators
    println(i + j)
    println(i - j)
    println(i * j)
    println(i.toFloat() / j)

    // Relational Operators
    println(i > j)
    println(i < j)
    println(i >= j)
    println(i <= j)
    println(i == j)
    println(i != j)

    // Increment / Decrement Operators
    //    i++
    println(i)
    --j
    println(j)

    println(i++ + ++i)

    // Logical Operators
    val above70 = false
    val knowsProgramming = true


    // && AND
    var calledForInterview = above70 && knowsProgramming
    println(calledForInterview)

    // || OR
    calledForInterview = above70 || knowsProgramming
    println(calledForInterview)

    // Short circuiting
    var a = 10
    var b = 11

    var result = i == 10 && b++ == 11
    println(result)
}