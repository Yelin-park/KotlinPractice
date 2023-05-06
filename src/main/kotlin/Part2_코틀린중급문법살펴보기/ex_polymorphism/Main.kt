package Part2_코틀린중급문법살펴보기.ex_polymorphism

/*
[다형성의 활용]
    - 멤버 함수를 호출할 때, 참조 변수가 실제로 가리키고 있는 객체의 멤버 함수가 호출된다.
* */

open class AAA {
    open fun hello() = println("AAA 입니다.")
}

class BBB : AAA() {
    override fun hello() = println("BBB 입니다.")
}

fun main() {
    val one = AAA()
    val two = BBB()
    val three: AAA = two

    one.hello()
    two.hello()
    three.hello() // 참조 변수가 실제로 가리키고 있는 객체의 멤버 함수 호출
}