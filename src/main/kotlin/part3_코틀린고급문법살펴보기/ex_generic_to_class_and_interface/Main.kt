package part3_코틀린고급문법살펴보기.ex_generic_to_class_and_interface

/*
[클래스와 인터페이스에서 제네릭 사용하기]
 - 제네릭이 적용된 클래스와 인터페이스에는 이름 옆에 <타입 인수>를 붙여야 한다.
   생성자를 호출할 때도 생성자 이름 옆에 <타입 인수>를 붙인다.
* */

fun main() {
    val pair: Pair<Int, Double>
    pair = Pair<Int, Double>(15, 9.12)
    println(pair.toString())
}