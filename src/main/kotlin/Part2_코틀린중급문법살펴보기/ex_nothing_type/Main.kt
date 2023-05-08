package Part2_코틀린중급문법살펴보기.ex_nothing_type

import java.lang.Exception

/*
[Nothing 타입]
    - Nothing 타입은 throw를 표현식으로 쓸 수 있게 하기 위한 장치
    - Nothing 타입은 실행 흐름이 도달할 수 없는 구역을 나타내기 위한 특수 타입이다.
    - 코틀린에서는 throw 표현식 문장도 표현식으로 취급한다.
* */

fun throwing(): Nothing = throw Exception()

fun main() {
    println("start")
    // Int 타입의 변수에 Nothing 타입의 표현식을 대입
    // Nothing 타입은 어떠한 타입과도 호환되기 때문에 이러한 코드가 가능함
    // Int 타입에 Nothing 타입을 대입한다고 해도, throwing 함수가 호출되면 곧바로 예외가 던져져 프로그램이 강제 종료되므로 문제가 되지 않는다.
    val i: Int = throwing()
    println(i)

    validate(-2)
    /*
    Exception in thread "main" java.lang.Exception: num이 음수입니다.
	at Part2_코틀린중급문법살펴보기.ex_nothing_type.MainKt.validate(Main.kt:32)
	at Part2_코틀린중급문법살펴보기.ex_nothing_type.MainKt.main(Main.kt:22)
	at Part2_코틀린중급문법살펴보기.ex_nothing_type.MainKt.main(Main.kt)
     */
}

// Nothing 타입 활용하는 상황
fun validate(num: Int) {
    val result: Int = 
        if(num >= 0) num
        // Nothing 타입의 표현식이기 때문에 if-else 블록이 Int 타입의 표현식으로 인식됨
        // if 블록이 Int, else 블록이 Nothing 타입이면, if-else는 Int 타입을 따라간다.
        // 만약 throw Exception 부분이 표현식이 아니라면 Unit 타입이 되어버리므로 서로 호환이 되지않아 사용할 수 없음
        else throw Exception("num이 음수입니다.") // 해당 타입은 Nothing 타입
}