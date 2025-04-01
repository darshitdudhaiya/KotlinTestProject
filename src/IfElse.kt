fun main()
{
    val isRaining = true

    if(isRaining)
    {
        println("Take Umbrella")
    }
    else
    {
        println("No Rains - Enjoy Yourself!")
    }

    val x = 1
    val y = 2

    val result = if(x < y) {
        "X is Less than Y"
    } else if (x > y) {
        "X is More than Y"
    } else {
        "X is Equals to Y"
    }

    println(result)
}