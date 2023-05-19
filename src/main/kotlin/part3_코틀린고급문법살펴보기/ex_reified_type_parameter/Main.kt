package part3_코틀린고급문법살펴보기.ex_reified_type_parameter

/*
[구체화된 타입 매개변수]
 - 타입 매개변수 앞에 reified을 붙여주면 해당 타입 매개변수를 is 연산자를 사용할 수 있다.
   reified을 붙이려면 함수를 반드시 inline으로 선언해야 한다.
* */

// 다음 코드는 오류를 일으킨다. - 타입 매개변수는 is 연산자의 피연산자로 사용할 수 없다.
/*
fun <T> check() {
    val number = 0
    if(number is T)
        println("T는 Int 타입 입니다.")
}
 */

inline fun <reified T> check() {
    val number = 0
    if(number is T)
        println("T는 Int 타입 입니다.")
}

fun main() {
    check<Int>()
}