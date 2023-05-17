package part3_코틀린고급문법살펴보기.ex_lamda_expression

/*
[함수 리터럴과 람다식]
 - 코틀린에서는 함수 리터럴을 두 가지 형태로 만들 수 있다.
   여기서는 람다식을 다루고 있다
    { 매개변수 -> 반환 값} 형태

 - 함수 타입은 참조 타입이기 때문에 객체와 마찬가지로 스택 영역에 함수가 바로 저장되는 것이 아니라,
   함수의 위치를 가리키는 형태로 저장된다.
* */

fun main() {
    // 함수타입 : 매개변수가 Int 타입, 반환 타입 Unit인 함수를 저장할 수 있는 타입
    val instantFunc: (Int) -> Unit

    // 함수 리터럴 : 함수를 나타내는 리터럴
    /* number: Int => 리터럴의 매개변수를 나타냄
      -> 경계로 매개변수와 함수의 내용이 분리됨
      매개변수가 없는 함수 리터럴을 만들고 싶다면, number: Int -> 부분 없이 함수 내용만 나오게
      함수 리터럴에는 return을 적지 않는다. 리터럴의 반환 값은 함수 내용의 맨 마지막 표현식이 된다. */
      instantFunc = { number: Int -> println("Hello $number") }

    instantFunc(33)
    // 함수 타입의 변수는 invoke 멤버 함수를 통해서도 호출 가능
    /* 변수가 Nullable일 때는 invoke를 통해서 호출하는 편이 instantFunc?.invoke(33)과 같이
       쓸 수 있으므로 Null 처리를 하기 편해진다. */
    instantFunc.invoke(33)
}