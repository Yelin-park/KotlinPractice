package part3_코틀린고급문법살펴보기.ex_extension_function_inherit_relation

/*
[확장 함수의 리시버 타입이 상속 관계에 있을 때]
 - 확장 함수의 리시버 타입이 상속 관계에 있을 때
   멤버 함수와 다르게 참조 변수가 실제로 가리키는 객체의 타입을 따르지 않고
   참조 변수의 타입을 그대로 따른다.
* */

open class AAA; class BBB: AAA()

fun AAA.hello() = println("AAA")
fun BBB.hello() = println("BBB")

fun main() {
    val test: AAA = BBB()
    test.hello() // AAA
}