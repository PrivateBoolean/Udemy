package ObjectO

abstract class AbstractPerson(open val name: String, open var age: Int) {
    abstract fun speak()
}

class AbsStudent(override val name: String, override var age: Int, val studentID: Long): AbstractPerson(name, age) {
    override fun speak() {
        println("Hey. I am a student.")
    }
}

class AbsEmployee(override val name: String, override var age: Int): AbstractPerson(name, age) {
    override fun speak() {
        println("Good day. I am an employee.")
    }
}

fun main(args: Array<String>) {
    val absStudent = AbsStudent("Ahri", 26, 40934823)
    absStudent.speak()

    val absEmployee = AbsEmployee("Heimerdinger", 307)
    print(absEmployee.name + " says: ")
    absEmployee.speak()
}