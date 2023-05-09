package Part2_코틀린중급문법살펴보기.ex_is_operator

import Part2_코틀린중급문법살펴보기.ex_inheritance.Person
import Part2_코틀린중급문법살펴보기.ex_inheritance.Student

/*
[is 연산자]
    - is 연산자로 참조 변수가 실제로 가리키고 있는 객체의 타입을 알아낼 수 있다.
       자바의 instanceof에 해당
* */

// Person 클래스를 상속하는 Professor 클래스 선언
class Professor(name: String, age: Int): Person(name, age)

fun main() {
    val person: Person = Student("토니스타크", 33, 20171225)
    print("${person is Person} ")
    print("${person is Student} ")
    print("${person is Professor} ")

    val person2: Person = Professor("짱구", 5)
    print("${person2 is Person} ")
    print("${person2 is Student} ")
    print("${person2 is Professor}")

    println()

    // is 연산자는 when에서 다음과 같이 사용할 수 있다.
    val person3: Person = Student("철수", 5, 121212)

    when(person3) {
        is Person -> {println("Person 타입의 ${person3.name} 입니다.")}
        is Student -> {println("Student 타입의 ${person3.name} 입니다.")}
        is Professor -> {println("Professor 타입의 ${person3.name} 입니다.")}
    }
}