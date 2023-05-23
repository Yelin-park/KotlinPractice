package part4_코틀린표준라이브러리살펴보기.ex_to

/*
[to 확장 함수: 두 값을 간단히 Pair로 묶기]
 - to 확장 함수를 이용하여 Pair 객체를 간단히 생성할 수 있다.

 - to는 모든 타입에 적용되는 확장 함수이다.
   infix fun <A, B>A.to(that: B): Pair<A, B> = Pair(this, that)
   리시버 타입에 제네릭을 적용했기 때문에 모든 타입에 이용 가능
   내부적으로 Pair 생성자를 호출하여 Pair 객체를 생성한 뒤 반환
   infix로 선언되어 있기 때문에 연산자를 쓰듯 사용
* */

fun main() {
    val test: Pair<Int, Double> = 10 to 3.14

    println(test)
}