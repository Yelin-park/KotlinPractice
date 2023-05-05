package Part1_코틀린기초문법살펴보기
/*
[문자열(String)]

 */
fun main(args: Array<String>): Unit
{
    var str: String = "Hello"
    println(str)

    str = str + "\nKotlin!"
    println(str)

    println(str[8]) // String에도 대괄호를 사용하여 원하는 문자를 반환할 수 있음

    val num = 10 * 5 + 3
    println(str + num)
}