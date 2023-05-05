package Part1_코틀린기초문법살펴보기

/*
[흐름 제어 - 반복문 do-while]
    do {
        do-while에 포함시킬 문장들
    } while(Boolean 표현식)
*/

fun main(args: Array<String>): Unit {
    var i = 1
    do {
        println("실행됨")
    } while(i == 0)
}