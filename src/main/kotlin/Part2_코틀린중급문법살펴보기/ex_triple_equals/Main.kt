package Part2_코틀린중급문법살펴보기.ex_triple_equals

/*
[===, !== 연산자]
    === 연산자 : 두 참조 변수가 '같은 객체'를 가리키고 있으면 true, 아니면 false
    !== 연산자 : 두 참조 변수가 '서로 다른 객체'를 가리키고 있으면 true, 아니면 false
    
    코틀린의 === 연산자는 자바의 == 연산자와 같다.
    코틀린에서의 == 연산자는 자바의 equals 메서드를 호출한 것과 같은 효과
*/

fun main(args: Array<String>): Unit {
    var a = "one"
    var b = "one"

    println(a === b)

    b = "on"
    b += "e"
    println(a !== b)

    b = a
    println(a === b)
}