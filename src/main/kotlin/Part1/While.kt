package Part1

/*
[흐름 제어 - 반복문 while]
    while(Boolean 표현식) {
        while에 포함시킬 문장들
    }
*/

fun main(args: Array<String>): Unit {
    var i = 1

    while(i < 10) {
        println(i)
        i += 1
    }
}