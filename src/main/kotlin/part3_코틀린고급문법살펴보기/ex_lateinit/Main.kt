package part3_코틀린고급문법살펴보기.ex_lateinit

/*
[lateinit]
 - 사용자 정의 클래스 초기화할 때 lateinit 키워드를 사용하면 바로 초기화하지 않아도 된다.

 - lateinit 키워드는 var 프로퍼티에만 붙일 수 있다.

 - lateinit 프로퍼티가 초기화되었는지 여부를 확인하려면 다음과 같이 한다.
 if(rect::pt.isInitialized) {
 }
* */

// 점을 표현하는 클래스
class Point(val x: Int, val y: Int)

// 사각형을 표현하는 클래스
class Rect {
    // lateinit 키워드 붙은 프로퍼티는 클래스 안에서 바로 초기화하지 않아도 된다.
    lateinit var pt: Point
    lateinit var pt2: Point

    val width: Int get() = pt2.x - pt.x
    val height: Int get() = pt2.y - pt.y
    val area get() = width * height
}

fun main() {
    val rect = Rect()
    rect.pt = Point(3, 3)
    rect.pt2 = Point(6, 5)

    println("너비: ${rect.width}")
    println("높이: ${rect.height}")
    println("넓이: ${rect.area}")

}