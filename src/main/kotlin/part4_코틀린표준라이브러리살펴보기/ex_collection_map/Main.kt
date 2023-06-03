package part4_코틀린표준라이브러리살펴보기.ex_collection_map

/*
[컬렉션 원소 타입 변환하기]
 - map 계열의 확장 함수를 이용하면 Collection<T> 타입을 Collection<R> 타입으로 변환할 수 있음
* */

fun main() {
    val origin = listOf(65, 66, 67, 68, 69)

    /* 기본적인 기능은 T 타입의 원소를 R 타입의 원소로 변환
    (T) -> R 타입의 변환 함수를 인수로 받음.
    map 함수는 각 원소에 transform 함수를 적용하여 T 타입의 원소를 R 타입으로 변환한다.
    map에 it.toChar() 함수 리터럴을 전달하여 Int 타입의 원소를 Char 타입으로 변한
    */
    println(origin.map { it.toChar() }) // [A, B, C, D, E]

    println(origin.mapIndexed { index, element ->
        println("[$index]: $element")
        element.toChar()
    })
    /*
    [0]: 65
    [1]: 66
    [2]: 67
    [3]: 68
    [4]: 69
    [A, B, C, D, E]
    */

    val to100 = 1.. 100
    println(to100.mapNotNull {
        if(it % 3 == 0) it
        else null
    })
    // [3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
}