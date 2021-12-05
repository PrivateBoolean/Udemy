package Loops

// Challenge 2 at the end of the code.

fun main(args: Array<String>) {

    for (i in 1..10) {
        println(i)
    }

    var sum = 0
    for (i in 1..100) {
        sum = sum + i
    }
    println(sum)

    val list = listOf("Java", "Kotlin", "Python", "CTicTacToe")
    for (element in list) {
        println(element)
    }

    for ((index, value) in list.withIndex()) {
        println("Element at $index is $value")
    }

    /* ----- */

    var number = 9
    while (number >= 0) {
        println(number)
        number--
    }

    var number2 = 1
    while (number2 <= 10) {
        println(number2)
        number2++
    }

    /* ----- */

    val langName = "CTicTacToe"
    println(langName)

    for (c in langName) {
        if (c == 'a') {
            break
        }
        print(c)
    }
    println("\n---")

    val objectsList = listOf("Fan", "Pen", "Computer", "Mug")
    for (str in objectsList) {
        if (!str.contains('e')) {
            continue
        }
        println(str)
    }

    /* ----- */

    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (i - j == 5) {
                break@outer
            }
            println("$i - $j = " + (i-j))
        }
    }
    println("\n---\n")

    /* -- Coding Challenge 2 -- */

    // Program that calculates the sum of all numbers from 100 to 100 000 and prints out the result.

    var challengeSum = 0L
    for (i in 100..100000L) {
        challengeSum = challengeSum + i
        println(challengeSum)
    }

}