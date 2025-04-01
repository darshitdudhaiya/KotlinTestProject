fun main() {

    println("\n\n While")
    var count = 5

    while (count >= 1) {
        println("Counter is $count")
        count--
    }

    println("\n\nDo While")
    count = 5
    do{
        println("Counter is $count")
        count--
    }while(count > 0)

    println("\n\nFor")
    count = 5
    for (i in 1..count step 2) {
        println("Counter is $i")
    }

    println("\n\nUntil For")
    for (i in 1 until count step 2) {
        println("Counter is $i")
    }

    println("\n\nFor Reverse")
    for (i in count downTo  1 ) {
        println("Counter is $i")
    }

}