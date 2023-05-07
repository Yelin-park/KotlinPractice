package Part2_코틀린중급문법살펴보기.ex_throw_exception

import java.lang.Exception

/*
[예외 던지기]
    - 예외는 기본적으로 시스템에 의해 일어나지만, 고의로 예외를 발생시킬 수도 있다.
      고의로 예외를 발생시키는 것을 '예외를 던진다'라고 표현한다.
    
    - 예외를 던질 때는 다음과 같이 쓴다.
      throw Throwable 타입 표현식

    - 코틀린에는 throws 키워드가 없다.
      코틀린 함수는 자바처럼 메서드 선언에 예외 정보를 포함하지 않는다.
      why? 자바에서는 throws가 있는 함수를 호출할 때 마다 매번 try-catch 블록으로 감싸야한다.
      간결함을 중시하는 코틀린에서는 과감히 throws 키워드를 제거해버렸다.
      
    - 예외가 던져지면 자신을 호출했던 함수로 예외 처리의 책임을 전가시킨다.
      그 함수에서도 예외 처리를 하지 않으면, 그 함수를 호출했던 함수로 또 예외 처리의 책임을 전가한다.
      이렇게되면 언제가는 main 함수까지 예외 처리의 책임이 도달하게 된다.
      main 함수에서마저도 예외를 처리하지 않으면 프로그램은 강제 종료된다.
* */

fun main() {
    try {
        // something() 호출되면서 그 안에 div() 호출이 되고 b가 0이라서 throw Exception을 던짐
        something()
        
        // e 객체의 message 프로퍼티에는 div() 함수에서 전달한 String 메시지가 들어있다.
    } catch (e: Exception) {
        println(e.message)
    }

    // try-catch문으로 감싸지 않으면 아래와 같이 에러 메시지가 보이고 프로그램이 강제 종료된다.
    /*
    Exception in thread "main" java.lang.Exception: 0으로 나눌 수 없습니다.
	at Part2_코틀린중급문법살펴보기.ex_throw_exception.MainKt.div(Main.kt:40)
	at Part2_코틀린중급문법살펴보기.ex_throw_exception.MainKt.something(Main.kt:32)
	at Part2_코틀린중급문법살펴보기.ex_throw_exception.MainKt.main(Main.kt:26)
	at Part2_코틀린중급문법살펴보기.ex_throw_exception.MainKt.main(Main.kt)
     */
    something()
}

fun something() {
    val num1 = 10
    val num2 = 0
    div(num1, num2)
}

// a를 b로 나눈 몫을 반환하는 함수
fun div(a: Int, b: Int): Int {
    if(b == 0) {
        /* 여기서는 Throwable이 아닌 Exception의 인스턴스를 생성했는데
        Exception이 Throwable 클래스를 상속하므로 문제 없다. */
        throw Exception("0으로 나눌 수 없습니다.") // 예외 던지기
    }
    return a/b
}
