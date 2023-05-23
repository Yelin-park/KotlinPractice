package part4_코틀린표준라이브러리살펴보기.ex_triple

/*
[Triple 클래스: 세 변수를 하나로 묶기]
 - Triple 클래스를 이용하면 세 변수를 하나로 묶을 수 있다.
    data class Triple<out A, out B, out C>(
        val first: A,
        val second: B,
        val third: C): Serializable

 - Triple 클래스는 제네릭을 이용하여 세 가지 타입의 값을 보관한다.
* */

fun calculateCircle(radius: Int): Triple<Int, Double, Double> =
    Triple(radius * 2, radius * 2 * 3.14, 3.14 * radius * radius)

fun main() {
    val(diameter, _, area) = calculateCircle(5)
    println("지름 : $diameter")
    println("넓이 : $area")
}