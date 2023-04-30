package Part1

/*
[흐름제어 - 조건문 if]
*/

fun main(args: Array<String>): Unit
{
    var a = 15
    val b = 11

    if(a > b)
    {
        println("if 안으로 들어옴")
        a -= b
    }

    println(a)
}