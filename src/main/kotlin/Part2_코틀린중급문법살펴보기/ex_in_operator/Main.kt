package Part2_코틀린중급문법살펴보기.ex_in_operator

/*
[in 연산자]
    - in 연산자는 어떤 값이 객체에 포함되어 있는지 여부를 조사하는 역할
    - in 연산자는 operator fun contains(매개변수: 타입): Boolean 멤버 함수로 오버로딩 OK
    - in 연산자는 when 문에서도 쓸 수 있다.
* */

fun main() {
    println('o' in "Kotlin")
    println("in" !in "Kotlin")
}