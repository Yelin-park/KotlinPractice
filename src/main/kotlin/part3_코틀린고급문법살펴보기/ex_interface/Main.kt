package part3_코틀린고급문법살펴보기.ex_interface

/*
[인터페이스]
 - 클래스에 어떤 멤버 함수와 프로퍼티가 반드시 존재한다는 것을 보장하기 위한 장치
 
 - class 키워드 대신 interface 키워드 사용하면 인터페이스 선언

 - 인터페이스는 멤버 함수, 추상 멤버 함수, 추상 프로퍼티를 가질 수 있다.
   일반 프로퍼티와 생성자는 가질 수 없다.

 - 인터페이스는 기존의 클래스를 확장한다는 것보다는, 어떤 클래스에 플러그인을 추가한다는 개념에 가깝다.
* */

interface Printable {
    // print 멤버 함수 내용이 비어있으면 자동으로 abstract가 붙는다.
    fun print(): Unit
}

// AAA 클래스가 Printable 인터페이스를 구현
// 인터페이스는 생성자가 존재하지 않기 때문에 이름 옆에 () 쓰지 않음
class AAA: Printable {
    override fun print() {
        println("Hello")
    }
}

// Printable 타입의 인수를 받는 print 함수 선언
fun print(anything: Printable) {
    // 매개변수 타입이 Printable이므로 그 매개변수가 가리키는 객체에 print 함수가 들어있다는 것을 항상 보장
    anything.print()
}

fun main() {
    print(AAA()) // Hello
}