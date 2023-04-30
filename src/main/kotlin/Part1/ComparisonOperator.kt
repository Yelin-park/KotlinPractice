package Part1

/*
[비교 연산자]
    코틀린에서 ==, != 연산자는 자바의 equals 메서드 호출한 것과 동일
    자바처럼 객체의 참조 값끼리 비교하려면 ===, !== 연산자를 사용해야함
*/
fun main(args: Array<String>): Unit {
    var isRight: Boolean = (10 + 70) > (3 * 25)
    println(isRight)

    isRight = false
    println(isRight)

    isRight = 30 == (10 + 20)
    println(isRight)

    isRight = 0.00001f == 0.005f * 0.002f
    println(isRight)

    isRight = 3.0 * 5 + 2.7 <= 16
    println(isRight)
}