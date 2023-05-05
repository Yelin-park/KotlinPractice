package Part1_코틀린기초문법살펴보기

/*
[매개변수와 인수]
    매개변수는 함수를 호출한 곳으로부터 값을 전달받을 때 사용
    매개변수를 선언할 때는 var이나 val 키워드를 붙이지 않는다.
    매개변수는 무조건 val로 선언되므로 값을 수정할 수 없다.
    매개변수에 저장되는 표현식을 인수라고 한다.
*/

fun main(args: Array<String>): Unit {
    println(cToF(30)) // 30은 인수
    println(getAverage(89, 96))
}

// 섭씨 온도를 화씨 온도를 변환하는 함수
fun cToF(celsius: Int): Double {
    return celsius * 1.8 + 32
}

// 평균을 구하는 함수
fun getAverage(a: Int, b: Int): Double {
    return (a + b) / 2.0
}