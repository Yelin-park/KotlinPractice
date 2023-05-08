package Part2_코틀린중급문법살펴보기.ex_elvis_operator

/*
[엘비스 연산자 ?:]
    - 엘비스 연산자는 왼쪽의 피연산자가 null이 아니면 그 값을 그대로 쓰고,
      null이면 우측의 피연산자로 대체하는 연산자이다.
      즉, null이면 우측에 있는 값으로 대체하는 연산자
* */

fun main() {
    val number: Int? = null
    println(number?:0)

    val number2: Int? = 15
    println(number2?:0)

    val str: String? = null
    println(str?:"Hello")

}