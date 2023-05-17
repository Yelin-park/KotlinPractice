package part3_코틀린고급문법살펴보기.ex_function_reference

/*
[함수 참조]
 - 함수 타입의 변수는 이미 선언되어 있는 함수나 객체의 멤버 함수를 가리킬 수도 있다.

 - 함수 이릎 앞에 ::를 붙이면, 표현식의 값은 그 함수의 참조값이 되며,
   타입은 그 함수의 시그니처에 맞는 함수 타입이 된다.
   * 코틀린 1.1 버전까지는 ::plus가 아닌 this::plus 형태로 적어야 한다.

 - 객체의 멤버 함수를 함수 타입의 표현식으로 바꾸려면 '참조 변수::멤버 함수'의 꼴로 적는다.
* */

fun plus(a: Int, b: Int) = println("plus 호출됨 ${a + b}")

object Object {
    fun minus(a: Int, b: Int) = println("Object의 minus 호출됨 ${a - b}")
}

class Class {
    fun average(a: Int, b: Int) = println("Class average 호출됨 ${(a + b) / 2}")
}

fun main() {
    var instantFunc: (Int, Int) -> Unit
    instantFunc = ::plus
    instantFunc(60, 50) // plus 호출됨 110

    instantFunc = Object::minus
    instantFunc(36, 12) // Object의 minus 호출됨 24

    instantFunc = Class()::average
    instantFunc(25, 5) // Class average 호출됨 15
}