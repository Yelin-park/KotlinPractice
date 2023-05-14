package part3_코틀린고급문법살펴보기.ex_companion_object

/*
[동반자 객체]
 - 동반자 객체란?
  클래스 안에 포함되는 이름 없는 객체이다.
  어떤 클래스의 모든 인스턴스가 공유하는 객체를 만들고 싶을 때 사용한다.
  * 코틀린에는 static 키워드가 존재하지 않아 static의 효과를 얻고 싶으면 동반자 객체를 사용해야함

 - 동반자 객체를 정의할 때는 이름 없이 companion object라고만 적는다.

 - 동반자 객체는 자신이 속한 클래스의 이름으로 접근할 수 있다.
   Person이라는 식별자는 Person 클래스의 동반자 객체로 인식.
   동반자 객체는 클래스당 한 개만 존재
 
 - 어떤 클래스 안에 동반자 객체를 정의해놓으면 Companion이라는 식별자가 자동으로 생성
    따라서 Person.create()는 Person.Companion.create()로도 호출할 수 있다.
* */

class Person private constructor() {
    companion object { // 동반자 객체 정의
        /* 해당 멤버 함수를 통해서만 Person 객체를 생성할 수 있도록 하기 위해
         생성자의 접근지정자를 private로 지정 */
        fun create(): Person { // Person 인스턴스를 생성하는 멤버 함수
            countCreated += 1 // 생성한 인스턴스 갯수를 셈
            return Person()
        }

        var countCreated = 0
            private set // 외부에서 조작하지 못하게 private로 지정
    }

}

fun main() {
    val a = Person.create()
    val b = Person.create()
    println(Person.countCreated)
}