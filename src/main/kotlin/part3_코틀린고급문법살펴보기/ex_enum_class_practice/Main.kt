package part3_코틀린고급문법살펴보기.ex_enum_class_practice

/*
[열거 클래스 활용하기]
 - 모든 열거 클래스는 자동으로 Enum이라는 클래스를 상속한다.
   Enum 클래스에는 다음과 같은 멤버가 있다.
    val name: String => 열거 상수의 이름을 가져옴
    val ordinal: Int => 열거 상수의 순서를 가져옴
   다음과 같은 멤버 함수가 기본적으로 포함되어 있다.
    fun valueOf(value: String): 열거 클래스 => 열거 클래스에 해당하는 열거 상수의 순서를 가져옴
    fun values(): Array<열거클래스> => 열거 클래스에 있는 모든 열거 상수들을 가져옴
* */

enum class Mode{
    SELECTION, PEN, SHAPE, ERASER
}

fun main() {
    val shapeMode: Mode = Mode.SHAPE
    println(shapeMode.name)
    println(shapeMode.ordinal)

    val modes:Array<Mode> = Mode.values()
    for(mode: Mode in modes)
        println(mode)

    println(Mode.valueOf("PEN").ordinal)
}
