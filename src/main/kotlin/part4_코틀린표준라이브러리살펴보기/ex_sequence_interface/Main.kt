package part4_코틀린표준라이브러리살펴보기.ex_sequence_interface

/*
[Sequence 인터페이스 살펴보기]
 - Sequence도 List처럼 일련의 데이터를 표현하는 인터페이스이다.
    Sequnece는 각 데이터를 게으르게 계산하기 때문에 잠재적으로 무한대의 데이터를 다룰 수 있다.
    * 프로그래밍에서 게으르다의 의미란?
       값을 미리 계산하여 가지고 있는 것이 아니라 필요한 순간에 계산을 시작하는 것을 뜻함

 - Sequence는 크기가 정해져 있지 않다. 데이터가 게으르게 계산되기 때문에 전체 크기를 한번에 파악할 수 없기 때문
   따라서 size나 length 같은 프로퍼티는 포함되지 않음

 - Sequence의 인터페이스 안에는 iterator 연산자 멤버 함수만 들어있다. Iterable 인터페이스와 같음
* */

fun main() {
    val seq: Sequence<Int> = sequenceOf(1, 2, 3)
    for(i in seq)
        print("$i ")
}