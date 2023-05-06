package Part2_코틀린중급문법살펴보기.ex_infix_notation

/*
[멤버 함수의 중위 표기법]
    - 중위 표기법이란?
        피연산자 연산자 피연산자의 순서로 표현식을 구성하는 방식을 뜻한다.
        멤버 함수의 매개변수가 하나뿐이면 함수 호출을 중위 표기법으로 할 수 있다.
        함수를 연산자처럼 호출하는 방법

    - 중위 표기법을 지원하려면 멤버 함수 선언문 앞에 infix를 붙여야 한다.
* */

class Point(var x: Int = 0, var y: Int = 0) {
    // base를 원점으로 생각했을 때의 좌표를 반환한다
    infix fun from(base: Point): Point {
        return Point(x - base.x, y - base.y)
    }
}

fun main() {
    // 아래 중위 표기법 호출은 Point(3,6).from(Point(1,1))의 문법적 설탕
    val pt = Point(3, 6) from Point(1, 1)
    println(pt.x)
    println(pt.y)
}