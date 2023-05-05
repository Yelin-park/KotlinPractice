package Part1_코틀린기초문법살펴보기

/*
[타입 별명]
    typealias 라는 키워드를 사용하면 이미 존재하는 타입에 별명을 붙일 수 있음
 */
typealias Number = Int

fun main(args: Array<String>): Unit
{
    val a: Number = 10
    println(a)
}