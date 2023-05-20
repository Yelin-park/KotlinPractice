package part3_코틀린고급문법살펴보기.ex_inherit_from_generic

/*
[제네릭이 적용된 클래스/인터페이스 상속.구현하기]
* */

fun main() {

    val rect = Rectangle(10, 5)
    val rect2 = Rectangle(3, 8)

    println(rect + rect2)
}