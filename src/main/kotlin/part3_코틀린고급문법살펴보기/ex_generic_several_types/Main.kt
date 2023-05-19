package part3_코틀린고급문법살펴보기.ex_generic_several_types

/*
[여러 타입을 인수로 받기]
 - 타입 인수를 여러 개 받으려면 fun 키워드와 함수 이름 사이를 <타입1, 타입2, ...> 형식으로 적는다.
* */

// 타입 매개변수 T와 R을 선언하여, 두 개의 타입 인수를 받을 수 있음
// mapper 매개변수에는 T 타입을 R 타입으로 변환하는 함수를 받도록 함
// T.map처럼 확장 함수의 리시버에도 타입 매개변수를 적용할 수 있다.
fun<T, R> T.map(mapper: (T) -> R): R {
    // 매개변수로 받은 mapper 함수에 리시버(this)를 넣어 호출한 뒤, 반환 값을 그대로 반환
    return mapper(this)
}

fun main() {
    // 11에 map 확장 함수 호출한 뒤 반환하는 함수를 mapper 매개변수로 전달. T와 R에 들어감
    // map 확장 함수의 반환 값을 square 뱐수에 저장
    val square: Int =
        11.map {
            it * it
        }

    println(square)
}