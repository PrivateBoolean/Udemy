package ObjectO

class House(val height: Double, val colour: String, val price: Int = 100000) {


    fun print() {
        println("House: \n\theight: $height metres\n\tcolor: $colour \n\tprice: $price")
    }
}

fun main(args: Array<String>) {
    val house = House(height = 8.6, colour = "Yellow", price = 180000)
    val blueHouse = House(height = 10.0, colour = "Blue", price = 200000)
    val brownHouse = House(height = 5.4, colour = "Brown")

    house.print()
    blueHouse.print()
    brownHouse.print()
}