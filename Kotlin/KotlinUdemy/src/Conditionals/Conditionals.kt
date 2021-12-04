package Conditionals

import java.util.*

//import kotlin.random.Random

fun main(args: Array<String>) {
    val age: Int = 21

    if (age < 18) {
        println("Too young to register!\n")
    } else {
        println("Welcome!\n")
    }

    /* ----- */

    val mode: Int = 6

    when (mode) {
        1 -> println("One?")
        2 -> {
            println("Two!")
            println("Whee!")
        }
        3 -> println("This is epic.")
        else -> println("Nice try, pal.")
    }

    /* ----- */

    val mode2: Int = 1

    val result = when (mode2) {
        1 -> "This is one."
        2 -> {
            "This is two"
            ", you know."
        }
        3 -> "Three here."
        else -> "Whatever the case may be."
    }
    println("\n\t" + result)

    /* ----- */

    val x = if (mode2 < 2) {
        println("It truly is less than two!")
        18
    } else {
        13
    }
    println(x)

    /* ----- */

    val i = 9

    when (i) {
        5 -> println("i is 5")
        3*6 -> println("i is 3*6")
        "Hey".length -> println("i is the length of string 'Hey'")
        in 1..10 -> println("i is between 1 and 10")
        !in 1..20 -> println("i is not between 1 to 20")
    }
    println("---")

    /* -- Coding challenge 1 -- */

    // Generate a random number between 1 and 50.
    val random = Random().nextInt(50) + 1

    // Print a message containing the range and the exact value of random.
    when (random) {
        in 1..10 -> println("Random is between 1 and 10: " + random)
        in 11..20 -> println("Random is between 11 and 20: " + random)
        in 21..30 -> println("Random is between 21 and 30: " + random)
        in 31..40 -> println("Random is between 31 and 40: " + random)
        else -> if (random > 40) {
            println("Random is larger than 40: " + random)
        }
    }

    /* ----- */

    // To be continued?

} // End fun main