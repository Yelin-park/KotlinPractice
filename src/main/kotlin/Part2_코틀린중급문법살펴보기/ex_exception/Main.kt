package Part2_코틀린중급문법살펴보기.ex_exception

/*
[예외]
    - 예외란? 프로그램 실행 중 예상치 못하게 발생한 상황을 뜻한다.
        예외가 발생하면 프로그램은 기본적으로 오류 메시지와 함께 종료된다.
* */

fun main() {
    val str = "abcd"
    val num = str.toInt()

    println(num)
    /*
    Exception in thread "main" java.lang.NumberFormatException: For input string: "abcd"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at Part2_코틀린중급문법살펴보기.ex_exception.MainKt.main(Main.kt:11)
	at Part2_코틀린중급문법살펴보기.ex_exception.MainKt.main(Main.kt)
     */
}