package part3_코틀린고급문법살펴보기.ex_const

/*
[const]
 - val 변수 앞에 const 키워드를 붙이면 변수에 접근하는 코드를 변수에 저장된 값으로 대체시킨다.

 - const가 붙은 변수에는 리터럴로 이루어진 표현식만 저장이 가능
   코틀린 문법 중에 리터럴만 와야하는 자리가 있는데 해당하는 곳에 사용하면 좋다.

 - const 키워드는 전역변수, 오브젝트의 프로퍼티 등에 붙일 수 있다(커스텀 Getter를 쓰면 X)
   프로그램 어디서나 바로 접근할 수 있는 변수에 붙임

* */

const val hello = "Hello" + "World!"

object Foo {
    const val bar = "bar"
}

fun main() {
    println(hello)
    println(Foo.bar)
    println(hello)
    println(Foo.bar)
}