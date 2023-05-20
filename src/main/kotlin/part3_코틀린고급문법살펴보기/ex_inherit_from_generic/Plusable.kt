package part3_코틀린고급문법살펴보기.ex_inherit_from_generic

/*
[제네릭이 적용된 클래스/인터페이스 상속.구현하기]
 - 제네릭이 적용된 클래스나 인터페이스는 상속할 때 타입 인수를 전달해 주어야 한다.
* */

// T 타입과 덧셈을 가능하게 하는 인터페이스 선언
interface Plusable<T> {
    operator fun plus(other: T): T
}