package part4_코틀린표준라이브러리살펴보기.ex_collection_filter

/*
[컬렉션 중 원하는 원소 걸러내기]
 - filter 계열의 확장 함수를 이용하면 컬렉션 중 원하는 원소만 걸러낼 수 있다.
* */

fun main() {
    val to50 = 1..50

    /* (T) -> Boolean 타입의 함수를 인수로 받으며, 각 원소를 predicate 함수에 넣어 호출
    predicate가 true를 반환한 원소만 결과 컬렉션에 남는다. */
    println(to50.filter { it % 4 == 0 })

    // filter의 정반대
    println(to50.filterNot { it % 4 == 0 })

    // null이 아닌 원소만 걸러내는 확장 함수
    println(to50.filterNotNull())

    println(to50.filterIndexed { index, element -> element > 20 })

    // 지정한 타입에 맞는 원소만 걸러내는 확장 함수
    println(to50.filterIsInstance<Long>())
}