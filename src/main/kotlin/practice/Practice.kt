package practice

import Part2_코틀린중급문법살펴보기.ex_upcasting.Person

class Student(var name: String) {

}

fun Student.checkName(): Boolean {
    return "박" in this.name
}

fun main() {
    var person: Person = Person("d",2)
    var person1: Person? = Person("Z", 3)
    person1 = null

    var str = "abcde5fgg"
    println("b" in str)
    
    var p1 = Student("박예린")
    var p2 = Student("문지환")
    println(p1.checkName())
    println(p2.checkName())

}

