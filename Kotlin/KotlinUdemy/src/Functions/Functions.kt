package Functions

import java.util.*

fun main(args: Array<String>) {
    helloWorld()

    printWithSpaces("Epic function!")

    println("Today is : " + getCurrentDate())

    println(max(30, 20))

    // Code along:
    println("\n\tCode along: \n")

    val numbers = listOf(1, 2, 3, 6, 20)

    println(reverse(numbers))

    println(reverse2(numbers))
}

fun printWithSpaces(text: String) {
    for (char in text) {
        print(char + " ")
    }
    println()
}

fun getCurrentDate(): Date {
    return Date()
}

fun max(a: Int, b: Int): Int {
    if (a >= b) {
        return a
    } else {
        return b
    }
}

fun helloWorld() {
    println("Hello World! This is my own function. Yay!")
}

    /* -- Code Along -- */

    // Display a list of numbers in reverse order.

fun reverse(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    for (i in 0..list.size-1) {
        result.add(list.get(list.size-1-i))
    }
    return result
}

fun reverse2(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    for (i in list.size - 1 downTo 0) {
        result.add(list.get(i))
    }
    return result
}

