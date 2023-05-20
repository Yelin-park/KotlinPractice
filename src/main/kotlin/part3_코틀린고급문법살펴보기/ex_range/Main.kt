package part3_코틀린고급문법살펴보기.ex_range

/*
[.. 연산자와 범위 표현식]
 - .. 연산자는 범위를 표현하는 연산자이다.
   어떤 값이 특정 범위에 들어있는지 조사할 때 사용하면 좋다.
 
 - .. 연산자는 operator fun rangeTo(매개변수: 자유타입):자유 타입 으로 오버로딩할 수 있음

 - Int 클래스에는 rangeTo가 선언되어 있음
   operator fun rangeTo(other: Int): IntRange

 - Char 클래스에는 rangeTo가 선언되어 있음
   operator fun rangeTo(other: Char): CharRange
* */

fun main() {
    // 1..10은 1.rangeTo(10)으로 컴파일 되며, IntRange 타입의 값이 반환됨
    // IntRange 클래스는 contains 연산자 멤버 함수를 갖고 있기 때문에 in 연산자 사용 가능
    val oneToTen: IntRange = 1..10
    println(5 in oneToTen)

    val upperAtoZ: CharRange = 'A'..'Z'
    if('C' in upperAtoZ)
        println("대문자 입니다.")
    
    if('p' in 'a'..'z')
        println("소문자 입니다.")
}