package Part2_코틀린중급문법살펴보기.ex_notnull_assertion_operator

import Part2_코틀린중급문법살펴보기.ex_member_function.Building

/*
[Not-null 단정 연산자 !!]
    - !! 연산자는 Nullable 타입을 Not-null 타입으로 강제로 캐스팅한다.
* */

fun main() {
    var obj: Building? = Building() 
    obj!!.name = "서울시청" // null이 아니기 때문에 Building 타입으로 캐스팅 
    println(obj!!.name)

    obj = null
    //obj!!.print() // obj가 null이기 때문에 KotlinNullPointerException 예외 발생
}