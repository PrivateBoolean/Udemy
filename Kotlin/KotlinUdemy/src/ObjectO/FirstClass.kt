package ObjectO

    // Coding Challenge... 4? at the end of the code.

class Person {
    open var name: String = "Annie"
    var age: Int = 30

    fun speak() {
        println("Hello. :)")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth(): Int {
        return 2021 - age
    }

    fun getYearOfBirth2() = 2021 - age
}

    /* -- Another person -- */

class PersonTwo(name: String, age: Int) {
    val name: String
    var age: Int

    init {
        this.name = name
        this.age = age
        println("A person was created.")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth(): Int {
        return 2021 - age
    }

    fun getYearOfBirth2() = 2021 - age
}

    /* -- YET another person -- */

class PersonThree(val name: String, var age: Int) {
    init {
        println("Yet another person was created.")
    }
    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth(): Int {
        return 2021 - age
    }

    fun getYearOfBirth2() = 2021 - age
}


fun main(args: Array<String>) {
    val person = Person()
    println("The name is " + person.name)
    println(person.name + " is " + person.age + " years old.")

    person.name = "Annie Tibbers"
    println("The name is actually " + person.name + ".")

    person.speak()
    person.greet("you")
    println(person.getYearOfBirth())
    println(person.getYearOfBirth2())

    /* -- Another person -- */

    val personTwo = PersonTwo("Pantheon", 35)
    personTwo.getYearOfBirth2()
    println(personTwo.name + " says: ")
    personTwo.greet("Teemo")

    /* -- YET another person -- */

    val personThree = PersonThree("Teemo", 10)
    println(personThree.name + " the human ward giggles: ")
    personThree.greet(personTwo.name)
    personThree.getYearOfBirth2()

    /* -- Coding Challenge 4? -- */

    println("\n\tCoding challenge 4 or something.\n")

    val book1 = Book("Harry Potter", "J.K. Rowling", 1997, false)

    book1.returnBook()
    book1.borrow()
    book1.borrow()
    book1.returnBook()
    book1.printBookInfo()


} // End main

    /* -- Coding Challenge 4? -- */

    // A class for a book, which has a title, an author, a publication year and is either borrowed or not.
    // Choose an appropriate data type for each property.
    // A book can be borrowed or returned. The borrowed property must change accordingly.
    // A book should also be able to print itself.

class Book(val title: String, val author: String, val yearPublished: Int, var borrowed: Boolean) {

    init {
        println("A book was created.\n")
    }

    fun printBookInfo() {
        println("Book: \n\tTitle = $title\n\tAuthor = $author\n\tYear published = $yearPublished")
    }

    fun borrow(): Boolean {
        if (borrowed) {
            println("Sorry, the book is not available at this time.")
            return false
        } else {
            borrowed = true
            println("Have a great time with a great book!")
            return true
        }
    }

    fun returnBook(): Boolean {
        if (!borrowed) {
            println("The book was not borrowed in the first place! Can't return what has not been borrowed.")
            return true
        } else {
            borrowed = false
            println("Thank you! Hope you had a blast.")
            return false
        }
    }
}