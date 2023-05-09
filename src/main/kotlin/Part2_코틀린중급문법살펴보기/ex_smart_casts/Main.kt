package Part2_코틀린중급문법살펴보기.ex_smart_casts

/*
[스마트 캐스팅]
    - 스마트 캐스팅 이란?
       특정 조건을 만족하는 경우, 컴파일러가 변수의 타입을 다른 타입으로 자동 캐스팅 하는 것
* */

fun main() {
    val number: Int?= null
    val number2 = 1225

    checkNull(number)
    checkNull(number2)
}

fun checkNull(any: Any?) {
    if(any == null) {
        println("null이 들어왔습니다")
        return
    }

    // any가 null 값이 아니라고 완벽히 추론이 가능하므로,
    // any?.toString()이 아닌 any.toString()으로 호출이 가능
    println(any.toString())
}
