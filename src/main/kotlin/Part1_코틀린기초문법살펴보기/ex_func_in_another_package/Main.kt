package Part1_코틀린기초문법살펴보기.ex_func_in_another_package

/*
[다른 패키지의 함수 호출하기]
    패키지 이름.함수 이름() 으로 다른 패키지에 선언된 함수를 호출
*/

fun main(args: Array<String>): Unit {
    println(Part1_코틀린기초문법살펴보기.ex_package.min(30, 10))
}