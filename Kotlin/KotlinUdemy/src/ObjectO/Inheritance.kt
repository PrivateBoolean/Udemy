package ObjectO

 // Mother class
open class OpenPerson(open val name: String, open var age: Int) {
    init {
        println("A new person was created.")
    }

    fun speak() {
        println("Hey y'all!")
    }

    fun greet(name: String) {
        println("Hey, $name!")
    }
}

 // Child classes
class Student(override val name: String, override var age: Int, studentID: Long): OpenPerson(name, age) {
    fun isIntelligent() = true
}
class Employee(override val name: String, override var age: Int): OpenPerson(name, age) {
    fun receivePayment() {
        println("Received payment.")
    }
}

fun main(args: Array<String>) {
    val student = Student("Jayce", 32, 9000)
    student.speak()
    student.greet("Viktor")
    println("This student is intelligent: " + student.isIntelligent())

    val employee = Employee("Viktor", 35)
    employee.speak()
    employee.greet(student.name)
    employee.receivePayment()
} // End main