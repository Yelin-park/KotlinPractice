package part3_코틀린고급문법살펴보기.ex_for

/*
[흐름 제어 - 반복문 for]
 - 아래 형태로 사용한다.
  for(변수 이름: 타입 in 표현식) { ... }
   * 코틀린의 for은 for-each 스타일만 지원한다.

 - in 우측의 표현식에는 다음과 같이 연산자 멤버 함수를 갖는 객체만 지정할 수 있다.
   operator fun iterator(): Iterator<자유타입>
    ex) for(변수이름: Double in 표현식) 형태로 사용하려면..
    표현식이 operator fun iterator(): Iterator<Double> 형태의 연산자 멤버 함수를 갖고 있어야 한다.
    즉, for 문 속의 변수 타입과 Iterator의 타입 인수가 같아야 한다.
* */

fun main() {
    /* IntRange 클래스에는 Iterator<Int> 타입을 반환하는 iterator 연산자 멤버 함수가
    선언되어 있으므로 for문의 in 연산자에 적용 가능. Iterator의 타입 인수가 Int 이므로,
     Int 타입과 호환되는 타입의 변수만 for 문의 소괄호 속에 선언할 수 있음 */
    for(i: Int in 1..10)
        println("$i ")
    println()

    for(i: Int in 1.. 10) {
        if(i > 5)
            break
        print("$i")
    }
    println()

    for(i: Int in 1..5) {
        if(i % 2 == 0) {
            println("$i 는 짝수입니다.")
        }
    }
}