package Part1_코틀린기초문법살펴보기

/*
[흐름 제어 - 조건문 if-else]
*/
fun main(args: Array<String>): Unit
{
    val a = 10
    val b = 5

    if(a < b)
        println("if")
    else
        println("else")

    if(a > b)
        println("a가 크다")
    else
        println("b는 a 이상이다.")
}