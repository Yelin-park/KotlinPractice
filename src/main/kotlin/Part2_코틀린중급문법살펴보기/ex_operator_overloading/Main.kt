package Part2_코틀린중급문법살펴보기.ex_operator_overloading

/*
[연산자 오버로딩]
* */

fun main() {
    val pt1 = Point(3, 7)
    val pt2 = Point(2, -6)

    val pt3 = pt1 + pt2
    val pt4 = pt3 * 6
    val pt5 = pt4 / 3

    pt3.print()
    pt4.print()
    pt5.print()
}