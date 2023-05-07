package Part2_코틀린중급문법살펴보기.ex_exception_handling

import java.lang.NumberFormatException

/*
[예외 처리]
* */

fun main() {
    try {
        val str = "abcd"
        val num = str.toInt()
        
        println(num)

        // e는 예외 객체를 가리키는 참조 변수이고, NumberFormatException은 예외 타입
    } catch(e: NumberFormatException) {
        println("문자열을 숫자로 변경하지 못함")

        // finally 블록은 예외 발생 여부와 상관 없이 무조건 실행되는 블록
    } finally {
      println("프로그램 종료")  
    }
}