package Part2_코틀린중급문법살펴보기.ex_null

import Part2_코틀린중급문법살펴보기.ex_upcasting.Person

/*
[Nullable 타입과 null]
    - Nullable 이란? null 값을 지정할 수 있는 변수를 뜻한다.
        null은 참조 변수가 어떠한 객체도 가리키지 않고 있음을 나타내는 키워드

    - 타입 이름 뒤에 ? 붙이면 변수를 Nullable하게 만들 수 있다.
        Byte, Short, Int, Long, Float, Double,Char, Boolean 타입 뒤에 ?를 붙이면
        그 변수는 참조 변수가 된다. 즉, 실제 데이터가 스택 영역이 아닌 힙 영역에 생성된다.
* */

fun main() {
    var person: Person? = Person("K", 30)
    person = null

    var num: Int? = null
    num = 10

    // if-else 표현식의 한쪽 블록에 null을 지정하면 Test는 String, null은 Nothing? 타입이다.
    // if-else 표현식의 타입은 이 둘이 합쳐진 String? 이 된다.
    val test = if(true) "Test" else null
    println(test)

}