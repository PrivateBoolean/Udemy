package Collections

fun main(args: Array<String>) {
    val array = arrayOf("Tea", "Sugar", "Milk")

    val list = listOf("Ananas", "Bananas", "Kananas")

    val arrayList = arrayListOf("I scream", "You scream", "Ice cream!")
    arrayList.add("We scream!")

    /* ----- */

    val mixedArray = arrayOf("It's over ", 9000)
    println(mixedArray[1])

    val onlyNumbers = intArrayOf(1, 3, 8, 12)

    val array2 = arrayOf("More tea", "More sugar", "More milk")
    val theBigArray = array + array2

    println(theBigArray.size)

    val isEmpty: Boolean = onlyNumbers.isEmpty()

    println(isEmpty)

    if (array2.contains("More sugar")) {
        println("The array contains 'More sugar'")
    } else {
        println("The array does not contain 'More sugar'")
    }

    println("\n---\n")

    /* ----- */

    val wordList = arrayListOf("Morning", "Evening", "Car")
    println(wordList[0])
    val anotherList = arrayListOf("Things")
    println(wordList + anotherList)
    println(wordList.size)
    println(wordList.isEmpty())
    println(wordList.contains("Car"))

    anotherList.add("Stuff")
    println(anotherList)
    println(anotherList.size)
    val added = anotherList.add(0, "Stranger")
    println(anotherList)

    val removed = anotherList.remove("Stuff")
    println(anotherList)
    println(removed)

    /* ----- */

    val subList = wordList.subList(1,3)
    println(subList)
}