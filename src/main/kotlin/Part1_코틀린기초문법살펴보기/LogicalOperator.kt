package Part1_코틀린기초문법살펴보기

/*
[논리 연산자]
*/

fun main(args: Array<String>): Unit
{
    val a = 15
    val b = 17

    var bool: Boolean = (a - b < a + b) && (a == 15)
    println(bool)

    bool = !((a + b) > (a * 3) || (b - a) > 0)
    println(bool)
}