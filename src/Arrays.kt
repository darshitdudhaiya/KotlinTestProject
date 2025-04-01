fun main() {
    var arr = arrayOf(1, 2, 3, 4, 5)
    var arr2 = arrayOf("One", "Two", "Three")
    var arr3 = arrayOf<String>("Four", "Five", "Six")

    for (item in arr3.withIndex()) {
        println(item.value + " " + item.index)
    }

    println(arr[0])
    println(arr.get(2))
    arr.set(2,20)
    println(arr[2])
    println(arr.size)
}