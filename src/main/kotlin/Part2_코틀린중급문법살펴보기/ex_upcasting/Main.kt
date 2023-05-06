package Part2_코틀린중급문법살펴보기.ex_upcasting

/*
[업캐스팅]
    - 캐스팅 또는 형변환이란?
        특정 타입을 다른 타입으로 변환하는 것을 뜻함.
        코틀린에서는 서브클래스의 인스턴스를 슈퍼클래스 타입으로 가리킬 수 있다.

    - 서브클래스의 인스턴스를 슈퍼클래스 타입으로 가리키는 것을 업캐스팅이라고 한다.
* */

open class Person(val name: String, val age: Int)

class Student(name: String, age: Int, val id: Int): Person(name, age)

fun main() {
    // 서브클래스의 인스턴스를 슈퍼클래스 타입으로 가리키는 것을 업캐스팅이라고 한다.
    val person: Person = Student("John", 32, 20171218)

    /* person 참조 변수는 Student 인스턴스를 가리키고 있기는 하지만,
       타입이 Person이기 때문에 name과 age 프로퍼티 밖에 접근하지 못한다. */
    // println(person.id) // Kotlin: Unresolved reference: id

    /* Person 타입으로 가리킨 Student의 인스턴스를 다시 원래 타입으로 가리킬 수는 없다. */
    // val student: Student = person // Kotlin: Type mismatch: inferred type is Person but Student was expected

    /* 슈퍼클래스 타입은 항상 슈퍼클래스 자체나 서브클래사의 인스턴스만 가리킬 수 있다.
        이처럼 한 객체가 여러가지 타입을 가질 수 있는 성질을 다형성이라고 한다. */

}
