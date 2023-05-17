package part3_코틀린고급문법살펴보기.ex_anonymous_function

/*
[익명 함수]
 - 익명 함수는 함수 리터럴을 작성하는 또 다른 방법이먀,
   함수의 이름이 없는 일반 함수와 형태가 거의 동일하다.

 - inline 같은 키워드를 붙일 수 없다는 점에서 일반 함수와 차이가 있다.

 - 익명함수는 람다식보다 복잡하지만 return으로 반환 값을 직접 지정해줄 수 있기 때문에
   마지막 표현식이 자동으로 반환 값이 되어버리는 람다식보다 버그를 일으킬 확률이 적다.
* */

fun main() {
    val instantFunc: (Int) -> Unit = fun(number: Int): Unit {
        println("Hello $number")
    }

    instantFunc(33)
    instantFunc.invoke(33)
}