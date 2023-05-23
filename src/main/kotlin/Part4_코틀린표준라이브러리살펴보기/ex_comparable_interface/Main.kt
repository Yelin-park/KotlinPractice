package Part4_코틀린표준라이브러리살펴보기.ex_comparable_interface

/*
[Comparable 인터페이스: 클래스를 비교 가능하게 만들기]
 - Comparable 인터페이스
    interface Comparable<in T> {
     operator fun compareTo(other: T): Int
    }
   타입 매개변수 T를 받으며, 연산자 멤버 함수로 compareTo를 가지고 있음
   즉, Comparable 인터페이스를 구현하는 클래스는 비교 연사자를 지원하게 됨
   
 - Comparable 인터페이스에는 다음과 같은 연산자 확장 함수가 기본적으로 선언
   따라서 해당 인터페이스를 구현하는 모든 클래스는 .. 연산자를 지원한다.
    operator fun<T: Comparable<T>> T.rangeTo(that: T): ClosedRange<T>
* */

class Rectangle(val width: Int, val height: Int): Comparable<Rectangle> {
    val area = width * height

    // 사각형의 넓이로 인스턴스의 크기를 비교하도록 오버라이딩
    override fun compareTo(other: Rectangle): Int =
        when {
            this.area > other.area -> 1
            this.area < other.area -> -1
            else -> 0
        }
}

fun main() {
    val rect = Rectangle(3, 5)
    val rect2 = Rectangle(7, 3)
    val rect3 = Rectangle(2, 9)

    println(rect >= rect3) // false
    println(rect < rect2) // true
    println(rect2 > rect3) // true
}