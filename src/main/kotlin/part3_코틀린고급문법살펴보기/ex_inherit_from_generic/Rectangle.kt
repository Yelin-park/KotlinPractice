package part3_코틀린고급문법살펴보기.ex_inherit_from_generic

/*
[제네릭이 적용된 클래스/인터페이스 상속.구현하기]
* */

class Rectangle(val width: Int, val height: Int): Plusable<Rectangle> {
    // plusable에는 제네릭이 적용되어 있으므로, 타입 인수를 전달해야 함(여기서는 Rectangle 타입 전달)
    // 인터페이스를 구현하면서 타입 인수를 Rectangle로 전달했으므로 매개변수와 반환 타입을 Rectangle
    override fun plus(other: Rectangle): Rectangle =
        Rectangle(width + other.width, height + other.height)

    override fun toString() = "width: $width, height: $height"
}
