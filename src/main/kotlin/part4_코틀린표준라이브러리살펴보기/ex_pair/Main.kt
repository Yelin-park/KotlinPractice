package part4_코틀린표준라이브러리살펴보기.ex_pair

/*
[Pair 클래스: 두 변수를 하나로 묶기]
 - Pair 클래스를 이용하면 두 변수를 하나로 묶을 수 있다.
    data class Pair<out A, out B>(val first: A, val second: B): Serializable
* */

// 두 수의 몫과 나머지를 반환
fun divide(a: Int, b: Int): Pair<Int, Int> = Pair(a / b, a % b)

fun main() {
    val(q, r) = divide(10, 3)
    println("몫: $q")
    println("나머지: $r")
}