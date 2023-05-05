package Part1_코틀린기초문법살펴보기

/*
[메모리의 스택 영역]
    지역 변수가 실제로 저장되는 영역
    함수에서 생성한 지역변수는 함수의 호출이 끝나면 스택 영역에서 사라진다.
*/

fun main(args: Array<String>): Unit {
    val a = -36
    val result = absolute(a)
    println(result)
}

// 입력받은 정수의 절대값을 반환하는 함수
fun absolute(number: Int): Int {
    return if(number >= 0) {
        number
    } else {
        -number
    }
}
