package Part2_코틀린중급문법살펴보기.ex_extension_property

/*
[확장 프로퍼티]
 - 확장 프로퍼티도 확장 함수처럼 프로퍼티 이름 앞에 리시버 타입을 적음
 - 확장 프로퍼티에는 Field가 존재하지 않아 field 식별자는 사용할 수 없음
* */

// 문자열이 큰지 판단하는 확장 프로퍼티
val String.isLarge: Boolean
    get() = this.length >= 10

fun main() {
    println("1234567890".isLarge) // true
    println("500 원".isLarge) // false
}