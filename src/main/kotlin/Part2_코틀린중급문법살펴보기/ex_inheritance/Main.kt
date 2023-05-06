package Part2_코틀린중급문법살펴보기.ex_inheritance

/*
[상속]
    - 상속은 기존에 존재하는 클래스를 확장하여 새로운 클래스를 정의하는 기법이다.

    - 코틀린에서 기본적으로 클래스는 상속이 막혀있다.(기본적으로 final)
      상속을 허용하려면, 클래스 정의부 앞에 open 키워드를 붙여주어야 함

    - 상속을 할 때는 반드시 슈퍼클래스의 생성자를 호출해야 하기 때문에
      Student의 생성자 매개변수에 name과 age를 추가하여 이를 Person 생성자에 전달하게 했다.

    - 상속 문법
        class 클래승 이름: 슈퍼클래스 생성자(인수) {
        }
        
    - 상속을 하면 슈퍼클래스의 프로퍼티와 멤버 함수가 서브클래스에 그대로 복사됨

    - 상속은 하나의 클래스만 할 수 있다.
* */

open class Person(val name: String, val age: Int)

// : Person(name, age) 이부분이 Person 클래스를 상속하는 코드
class Student(name: String, age: Int, val id: Int): Person(name, age)

fun main() {
    val person = Person("홍길동", 35)
    val student = Student("익순이", 23, 20171217)

    println(person.name)
    println(person.age)
    println(student.name)
    println(student.age)
    println(student.id)
}