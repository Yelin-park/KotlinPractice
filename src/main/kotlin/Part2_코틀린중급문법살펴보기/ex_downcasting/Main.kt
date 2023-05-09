package Part2_코틀린중급문법살펴보기.ex_downcasting

import Part2_코틀린중급문법살펴보기.ex_upcasting.Person
import Part2_코틀린중급문법살펴보기.ex_upcasting.Student

/*
[as 연산자와 다운캐스팅]
    - 다운캐스팅이란? 슈퍼클래스 타입을 서브클래스 타입으로 받는 것을 뜻한다.

    - 다운캐스팅을 위해서는 as 연산자를 사용한다.
        왼쪽 피연자(참조 변수)의 타입을 오른쪽 피연산자(타입)으로 캐스팅
        
    - 캐스팅에 실패했을 때 예외가 발생하는 것을 막고 싶으면 as? 연산자를 사용
        as? 연산자는 캐스팅에 실패하면 null을 돌려준다.
        ex) person2 as? Student 표현식의 타입은 Studnet?이고, 캐스팅에 실패히면 null 성공하면 Student 타입으로 변환된 객체를 반환
* */

fun main() {
    val person: Person = Student("John", 32, 20171218)
    val person2: Person = Person("Jack", 29)
    val person4: Person = Person("test", 29)

    var person5: Person?= person4 as? Student
    println(person5)

    // person 참조 변수가 가리키고 있는 객체는 Student 타입이므로 캐스팅 OK
    // 즉, Person -> Student로 다운캐스팅
    var person3: Student = person as Student
    println(person3)

    // person2 참조 변수가 가리키고 있는 객체는 Person 타입이므로 예외가 발생
    // Person -> Student로 캐스팅 X
    person3 = person2 as Student
    println(person3)

}