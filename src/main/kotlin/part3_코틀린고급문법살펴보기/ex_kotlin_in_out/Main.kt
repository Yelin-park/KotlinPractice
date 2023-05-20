package part3_코틀린고급문법살펴보기.ex_kotlin_in_out

/*
[in/out 키워드]
 - out 키워드를 붙이면 서브타입을 슈퍼타입에 대입 가능
 - in 키워드를 붙이면 슈퍼타입을 서브타입에 대입 가능
 - 타입 인수를 *로 지정하면 타입 인수가 무엇이든 상관없이 대입 가능 
* */

// AAA 클래스의 타입 매개변수 앞에 out 키워드를 붙임
// out 키워드를 붙이면 AAA<서브타입>을 AAA<슈퍼타입>에 대입할 수 있게 된다.
// out T는 자바의 ?extends T와 같다.
class AAA<out T>

// BBB 클래스의 타입 매개변수 앞에 in 키워드를 붙임
// in 키워드를 붙이면 BBB<슈퍼타입>을 BBB<서브타입>에 대입할 수 있게 된다.
// in T는 자바의 ?super T와 같다.
class BBB<in T>

fun main() {
    val aaaSub = AAA<Int>()
    val aaaSuper: AAA<Any> = aaaSub

    val bbbSuper = BBB<Any>()
    val bbbSub: BBB<Int> = bbbSuper

    // 타입 인수로 *를 지정하면, 타입 인수가 무엇이든 상관없이 AAA 타입을 대입할 수 있음
    val star: AAA<*> = aaaSub
}