package part3_코틀린고급문법살펴보기.ex_enum_class_members

/*
[열거 클래스에 프로퍼티와 멤버 함수 선언하기]
 - 열거 클래스도 클래스의 일종이기 때문에 프로퍼티와 멤버 함수를 가질 수 있다.
* */

enum class Mode(val number: Int) { // 생성자 매개변수에서 프로퍼티 선언
    SELECTION(0),
    PEN(1),
    SHAPE(2),
    ERASER(3); // 마지막 열거 상수에는 ; 반드시 붙여야 함

    // 열거 클래스에 멤버 함수 선언. 멤버 함수는 반드시 열거 상수 나열문보다 뒤에 와야함
    fun printNumber() {
        println("모드: $number")
    }
}

fun main() {
    // 현재 선택된 모드
    val mode: Mode = Mode.ERASER

    println(mode.number)
    mode.printNumber()
}
