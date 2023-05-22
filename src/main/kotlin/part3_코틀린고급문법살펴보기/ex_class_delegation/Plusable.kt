package part3_코틀린고급문법살펴보기.ex_class_delegation

/*
[클래스 위임]
 - 코틀린에서는 인터페이스의 구현을 다른 클래스에 맡길 수 있는 문법 제공
* */

// Int 타입과 덧셈을 가능하게 하는 인터페이스 선언
interface Plusable {
    operator fun plus(other: Int): Int
}