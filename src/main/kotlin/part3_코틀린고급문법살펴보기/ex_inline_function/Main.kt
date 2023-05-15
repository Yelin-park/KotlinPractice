package part3_코틀린고급문법살펴보기.ex_inline_function

/*
[inline 함수]
 - 함수 호출문이 함수 속에 들어있는 문장으로 대체되는 inline 함수.
   실행 흐름을 점프하지 않고 함수 호출문을 함수의 몸체로 대체하는 함수이다.

 - inline 함수는 재귀호출이 불가능 하다.

 - 주의) inline 함수는 함수 속의 문장을 재활용하지 않기 때문에 문장이 많은 함수를 inline 함수로 바꾸면
        프로그램의 크기가 기하급수적으로 늘아난다.
        -> 문장이 적고 빈번히 호출되는 함수만 inline 함수로 만들 것을 권장
* */

inline fun hello() {
    println("Hello")
    println("Kotlin")
}

fun main() {
    hello()
    hello()
    hello()
    
    // 컴파일 되는 순간 아래와 같이 됨
    /*
    println("Hello")
    println("Kotlin")
    println("Hello")
    println("Kotlin")
    println("Hello")
    println("Kotlin")
     */
}