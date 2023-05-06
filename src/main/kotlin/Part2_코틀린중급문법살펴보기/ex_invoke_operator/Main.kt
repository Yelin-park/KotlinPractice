package Part2_코틀린중급문법살펴보기.ex_invoke_operator

/*
[호출 연산자 ()]
* */

fun main() {
    val product = Product(762443, "코틀린 200제")
    product(108) // 컴파일 시 product.invoke(108)로 번역
}