package part3_코틀린고급문법살펴보기.ex_delegated_property

/*
[위임된 프로퍼티]
 - 코틀린에서는 프로퍼티의 Getter/Setter 구현을 다른 객체에 맡길 수 있는 문법을 제공
   프로퍼티 선언문 뒤에 'by 객체'를 적으면 해당 객체가 프로퍼티의 Getter/Setter를 대리하게 된다.
* */

fun main() {
    val sample = Sample()

    sample.number = -50
    println(sample.number) // 0

    sample.number = 100
    println(sample.number) // 100

}