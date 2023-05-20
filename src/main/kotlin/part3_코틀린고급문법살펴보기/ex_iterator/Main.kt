package part3_코틀린고급문법살펴보기.ex_iterator

/*
[반복자(Iterator)]
 - 반복자란? 특정 구간 속에 있는 원소를 하나씩 반복적으로 꺼내기 위한 인터페이스를 뜻한다.
   코틀린에는 Iterator라는 인터페이스가 기본적으로 선언되어 있으며, 다음과 같이 생겼다.
    interface Iterator<out T> {
     operator fun next(): T
     operator fun hasNext(): Boolean
    }
* */

fun main() {
    val range: IntRange = 1..3
    // IntRange 클래스에는 operator fun iterator(): IntIterator 연산자 멤버 함수 선언되어있음
    val iter: Iterator<Int> = range.iterator()

    // iter는 1..3 구간 중 첫 원소인 1의 바로 이전을 가리키고 있다.
    // 여기서 특정 원소를 가리키는 Iterator 내부의 변수를 '커서(Cursor)'라고 부름
    println(iter.hasNext()) // 다음 원소가 있으면 true, 없으면 false
    println(iter.next()) // 커서를 다음 원소 1로 이동, 1을 반환, 1 출력

    println(iter.hasNext())
    println(iter.next())

    println(iter.hasNext())
    println(iter.next())

    println(iter.hasNext())
}