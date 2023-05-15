package part3_코틀린고급문법살펴보기.ex_extension_function_companion_object

/*
[동반자 객체의 확장 함수]
 - 확장 함수를 다음과 같이 선언하면 동반자 객체에도 확장 함수를 달 수 있다.
  fun 클래스 이름.Companion.함수 이름() { }

 - 동반자 객체는 클래스 이름만으로 접근할 수 있지만, 확장 함수를 선언할 때 그렇게 하면 동반자 객체가 아닌
   클래스 자체에 멤버 함수가 추가되므로 Companion 식별자를 반드시 적어줘야 한다.
* */

// 빈 동반자 객체 정의
class Person{ companion object }

// 동반자 객체에 create 함수 주입
fun Person.Companion.create() = Person()

// Person 클래스의 동반자 객체에 주입된 create 함수를 호출
fun main() = Person.create()