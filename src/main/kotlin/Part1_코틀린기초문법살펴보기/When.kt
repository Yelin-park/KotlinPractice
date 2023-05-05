package Part1_코틀린기초문법살펴보기
/*
[흐름 제어 - 조건문 when]
    - 자바의 switch문과 비슷
    when(타깃 표현식) {
        타킷 표현식과 비교할 값 -> {
            N개의 문장
        }
    }
    
*/
fun main(args: Array<String>): Unit {

    val score = 64

    when(score / 10) {
        6 -> {println('D')}
        7 -> {println('C')}
        8 -> {println('B')}
        9, 10 -> {println('A')}
        else -> {println('F')}
    }

    println("test")

}