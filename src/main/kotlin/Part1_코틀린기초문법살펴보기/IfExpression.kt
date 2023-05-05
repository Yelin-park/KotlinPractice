package Part1_코틀린기초문법살펴보기

/*
[if-else를 표현식으로 사용하기]
    if 블록과 else 블록의 마지막 표현식의 타입은 일치해야 한다.
    if-else 표현식을 삼항 연산자처럼 사용 가능하므로 코틀린에서는 삼항 연산자가 존재하지 않음
*/

fun main(args: Array<String>): Unit {
    val value: Int = if(10 > 5) {
        println("10은 5보다 크다.")
        10
    } else {
        println("10은 5보다 크지 않다.")
        5
    }

    println(value)

    // if-else 블록이 비어있거나 마지막 문장이 표현식이 아니라면 Unit 타입이 된다.
    val a = if(10 > 5) {}
    else {}

    val b = if(10 > 5) {
        val c = 10
    } else {
        val d = 5
    }

    println(a) // kotlin.Unit
    println(b) // kotlin.Unit
    // println(c) // 변수 생성이 되지 않음
    // println(d) // 변수 생성이 되지 않음
}