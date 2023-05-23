package part4_코틀린표준라이브러리살펴보기.ex_closed_range_interface

/*
[ClosedRange 인터페이스: 닫힌 구간을 표현하는 인터페이스]
 - ClosedRange는 타입 매개변수로 Comparable<T>를 구현하는 타입만 받는다.
   대소 비교가 가능해야 범위를 형성할 수 있기 때문

 - start 프로퍼티는 구간의 최소 값을, endInclusive 프로퍼티는 구간의 최대값을 나타낸다.

 - contains는 in 연산자를 지원하는 역할을 하며, value >= start && value <= endInclusive 라는 기본 구현 제공

 - isEmpty는 구간이 비어 있는지 즉, 구간에 포함되는 객체가 존재하지 않는지 여부를 반환
   start > endInclusive 라는 기본 구현을 제공

 - 참고) 실수 타입에 대한 Range 클래스는 원래 존재하지 않았으나
        코틀린 1.1버전부터 ClosedFloatRange, ClosedDoubleRange라는 클래스 제공
        단, 이들은 IntRange, LongRange, CharRange 클래스와 다르게
        iterator 연산자 멤버 함수를 갖고 있지 않기 때문에 for 문의 in 연산자를 사용할 수 없다.
        사실 무한대의 소수점을 갖는 실수 타입에 유한개의 원소를 순회하는 반복자를 구현하는 것이 말이 안됨..
* */

fun main() {
    // 아래 3가지 모두 ClosedRange 인터페이스 구현
    val intRange: IntRange = 1..10
    val longRange: LongRange = 1L..100L
    val charRange: CharRange = 'A'..'Z'

    println(intRange.start) // 1
    println(longRange.endInclusive) // 100
    println('*' in charRange) // false
    println(charRange.isEmpty()) // false
}