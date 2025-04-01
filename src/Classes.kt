fun main() {
    val mustang = Car("Mustang","Petrol",1000)
    val beetal = Car("Beetal","Diesel",2000)

    println(mustang.name)
    println(mustang.type)

    println(beetal.name)

    mustang.drive()
    mustang.applyBreaks()
}

class Car(val name:String,val type:String,var kmRan:Int) {

    fun drive()
    {
        println("$name Car is drive.")
    }

    fun applyBreaks()
    {
        println("$name Car is apply breaks.")
    }

}