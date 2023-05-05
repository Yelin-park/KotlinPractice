package Part2_코틀린중급문법살펴보기.ex_class

/*
[클래스]
    <클래스 선언 형태>
    class 클래스 이름 {
     프로퍼티
    }

    - object 키워드로 객체를 일일이 생성했을 때는 객체의 타입에 이름이 없었다.
      심지어 객체를 여러 개 생성하면 객체의 형태가 완전히 같아도 서로 다른 타입으로 인식 된다.
      클래스로 생성된 객체는 공장에서 찍혀 나오는 공산품과 같기 때문에 모두 동일한 타입을 갖는다.

    - 객체를 생성할 때 자바에서 사용하는 new 키워드는 코틀린에서 사용하지 않는다.
      new 없이 생성자만 호출하면 된다.

    - 코틀린의 기본 접근지정자는 public
      자바는 default인데 코틀린이 이렇게 정의한 이유는 자바의 수많은 클래스와 메서드들이 public으로 선언되어 있다는 점 때문이다.
      즉, 간결한 코드를 중시하기 위해서!

    - 참조 변수를 초기화하지 않은 채 프로퍼티에 접근하면 오류 발생
            val person: Person
            person.age = 23
            (Variable 'person' must be initialized)
      반드시 참조 변수에 Person()을 대입해 주어야 한다.
*/

class Person {
    var name: String = ""
    var age: Int = 0
}

fun main(args: Array<String>): Unit {
    val person: Person
    person = Person()
    person.name = "홍길동"
    person.age = 36

    val person2 = Person()
    person2.name = "이동욱"
    person2.age = 40

    val person3 = Person()
    person3.name = "Ellie"
    person3.age = 29

    println(person.name)
    println(person.age)
    println(person2.name)
    println(person2.age)
    println(person3.name)
    println(person3.age)

}