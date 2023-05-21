package part3_코틀린고급문법살펴보기.ex_enum_class

/*
[열거 클래스]
 - 클래스 선언문 앞에 enum 키워드를 붙이면 열거 클래스로 선언 가능
 - 열거 클래스.열거 상수 형태로 초기화 가능
* */

enum class Mode {
    SELECTION, PEN, SHAPE, ERASER // 열거 상수
}

fun main() {
    // 현재 선택된 모드
    val mode: Mode = Mode.PEN
    
    when(mode) {
        Mode.SELECTION -> println("선택 모드")
        Mode.PEN -> println("펜 모드")
        Mode.SHAPE -> println("도형 모드")
        Mode.ERASER -> println("징개 모드")
    }
}