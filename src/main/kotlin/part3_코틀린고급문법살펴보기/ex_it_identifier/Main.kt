package part3_코틀린고급문법살펴보기.ex_it_identifier

/*
[it 식별자]
 - 람다식의 매개변수가 하나일 때는 매개변수 선언을 생략할 수 있다. : it 식별자 사용
* */

fun main() {
    val instantFunc: (Int) -> Unit = {
        println("Hello $it")
    }

    instantFunc(12)
}