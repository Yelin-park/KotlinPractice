package Part1

/*
[지역 함수]
    함수 속에 함수를 선언
*/

fun main(args: Array<String>): Unit {
    // main 함수 안에 선언된 지역 함수
    fun printFomular(a: Int, b: Int) {
        println(a * b + a - b)
    }

    printFomular(73, 1)
    printFomular(4, 6)
}