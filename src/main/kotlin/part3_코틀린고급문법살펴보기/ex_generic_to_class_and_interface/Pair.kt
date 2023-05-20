package part3_코틀린고급문법살펴보기.ex_generic_to_class_and_interface

/*
[클래스와 인터페이스에서 제네릭 사용하기]
 - 클래스나 인터페이스에서 타입을 인수로 받으려면 선언시 이름 옆에 <식별자>를 붙인다.
* */

/*
Pair 클래스에 타입 매개변수 A와 B를 선언 -> Pair 클래스에 두 개의 타입을 지정할 수 있음
A와 B타입의 프로퍼티를 선언 -> 클래스의 타입 매개변수는 클래스 내부 전체에서 사용이 가능
 */
class Pair<A, B>(val first: A, val second: B) {
    override fun toString() = "$first\n$second"
}