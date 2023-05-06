package Part2_코틀린중급문법살펴보기.ex_constructor

/*
[생성자와 초기화 블록]
    - 생성자를 정의하지 않으면 매개변수가 없는 기본 생성자가 자동으로 정의된다.
      매개변수가 있는 생성자를 정의하면 매개변수가 없는 기본 생성자는 자동으로 생성되지 않음
      
    <생성자 정의 방법>
     - constructor 키워드는 생략해도 됨
     class 클래스 이름 constructor(생성자의 매개변수 선언) {
     }

    - 코틀린의 생성자는 자바의 생성자와 다르다.
      생성자의 이름과 클래스의 이름은 동일하므로,
      코틀린에서는 생성자 정의부를 아예 클래스 이름에 합쳐버렸다.
*/

class Person constructor(name: String, age: Int) {

    // val 프로퍼티 선언(초기화하지않음)
    val name: String
    val age: Int
    
    // 초기화 블록
    // init 블록 안에서 프로퍼티를 초기화하면 프로퍼티를 선언과 동시에 초기화하지 않아도 됨
    init {
        this.name = name
        this.age = age
    }
}

fun main(args: Array<String>): Unit {
    // 생성자를 호출하면 init 블록이 실행되며 프로퍼티에 자동으로 값이 채워짐
    val person = Person("홍길동", 46)
    println("이름: ${person.name}")
    println("나이: ${person.age}")
}