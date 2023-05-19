package part3_코틀린고급문법살펴보기.ex_function_literal_with_receiver

/*
[리시버가 붙은 함수 리터럴]
 - 함수 리터럴에 리시버를 적용하여 확장 함수처럼 만들 수 있다.
 
 - 리시버가 붙은 함수 리터럴에는 리시버를 나타내는 this 키워드를 사용할 수 있다.
 
 - 호출은 리시버.변수(인수) 형태로 호출
  * 일반 함수 타입으로 호출할 때는 리시버를 첫 번째 인수로 전달하면 된다.
     Int.(Int, Int) -> Int 타입은 (Int, Int, Int) -> Int 타입에 대입
* */

fun main() {
    // Int 리시버를 [left, right] 범위 이내로 가공하여 반환하는 확장 함수
    // Int.(left: Int, right: Int) 리시버 타입이 Int, 매개변수의 타입이 (Int, Int)이며, 반환타입이 Int인 함수
    val makeSure: Int.(left: Int, right: Int) -> Int

    // 리시버가 적용된 함수 리터럴
    // * 익명 함수 형태는 fun Int.(left: Int, right: Int): Int {...}로 적으면 된다.
    makeSure = { left: Int, right: Int ->
        if (this < left) left
        else if (this > right) right
        else this
    } // makeSure

    println(15.makeSure(20, 40))
    println(18.makeSure(0, 50))
    println(25.makeSure(0, 19))
}

