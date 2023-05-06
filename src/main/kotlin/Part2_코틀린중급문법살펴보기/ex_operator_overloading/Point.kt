package Part2_코틀린중급문법살펴보기.ex_operator_overloading

/*
[연산자 오버로딩]
    class Point(var x = 0, var y = 0) 이라는 클래스가 있다고 가정
    아래와 같이 두 객체끼리 덧셈을 하려고 한다면 가능하지 않음
    val pt1 = Point(3, 7)
    val pt2 = Point(2, -6)
    val pt3 = pt1 + pt2
    연산자 오버로딩을 이용하면 위의 코드를 가능하게 할 수 있다.

    멤버함수 정의문 앞에 operator를 붙이면 Point의 인스턴스 간에 연산자를 사용했을 때
    이 멤버 함수를 대신 호출해달라는 뜻이다.
    plus, minus, times, div는 정해진 이름이며, 다른 이름을 사용하면 연산자 오버로딩이 제대로 되지 않는다.
* */

class Point(var x:Int = 0, var y: Int = 0) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    operator fun minus(other: Point): Point {
        return Point(x - other.x, y - other.y)
    }

    operator fun times(number: Int): Point {
        return Point(x * number, y * number)
    }

    operator fun div(number: Int): Point {
        return Point(x / number, y / number)
    }

    // 좌표 값을 출력
    fun print() {
        println("x: $x, y: $y")
    }
}