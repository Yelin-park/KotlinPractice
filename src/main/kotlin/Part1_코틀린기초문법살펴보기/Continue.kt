package Part1_코틀린기초문법살펴보기

/*
[흐름 제어 continue]
*/

fun main(args: Array<String>): Unit {
    var i = 0
    while(i < 10) {
        i += 1
        if(i % 2 == 0) {
            continue // continue 아래의 문장들을 모두 skip
        }
        print(i)
    }
}