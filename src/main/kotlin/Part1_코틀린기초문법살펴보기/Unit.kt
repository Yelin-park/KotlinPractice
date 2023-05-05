package Part1_코틀린기초문법살펴보기

/*
[Unit 타입]
    함수의 반환 값이 필요하지 않을 때 함수의 반환타입을 Unit으로 사용
    함수의 반환타입을 생략하면 자동으로 Unit이 된다.

    * 코틀린의 Unit 타입은 자바의 void에 대응되는 개념이지만 둘이 완전히 같은 것은 아니다.
      void는 반환 값이 없음을 의미하는 특수 타입이지만, Unit은 class 키워드로 정의된 일반 타입이기 때문이다.
      Unit 타입을 반환하는 함수는 return을 생략한다고 해도 암묵적으로 Unit 타입의 객체를 return 하도록 되어 있다.
      단, 그 Unit 객체는 싱글톤 인스턴스이기 때문에 매번 객체를 생성하지 않는다.
*/

fun main(args: Array<String>): Unit {
    celsiusToFah(27)
    celsiusToFah2(27)
    celsiusToFah3(27)
}

fun celsiusToFah(celsius: Int): Unit{
    println(celsius * 1.8 + 32)
}

fun celsiusToFah2(celsius: Int){
    println(celsius * 1.8 + 32)
}

// 함수에 포함된 문장이 한 개이므로, =로 축약 가능하다.
fun celsiusToFah3(celsius: Int) = println(celsius * 1.8 + 32)
