package Part2_코틀린중급문법살펴보기.ex_overriding

/*
[오버라이딩]
    - 오버라이딩이란?
      슈퍼클래스의 멤버 함수와 시그니처가 동일한 멤버 함수를 서브클래스에서 선언하면,
      슈퍼클래스 멤버 함수의 동작을 덮어쓰기 할 수 있다.

    - 멤버 함수도 오버라이딩을 허용하려면 open 키워드를 맨 앞에 붙여주어야 한다.

    - 코틀린에서 override 키워드를 반드시 붙여야한다.
      자바에서의 @Override 어노테이션을 붙이는 것은 옵션이였음 -> 깜빡할 수 있어 오류 발생
      
    - override 키워드는 그 자체로 open 키워드가 포함
      즉, override된 멤버 함수는 서브클래스에서 몇 번이고 재오버라이딩 가능!
      멤버 함수의 재 오버라이딩을 막으려면 final 키워드를 사용해야함
* */

open class AAA {
    open fun func() = println("AAA")
}

class BBB : AAA() {
    override fun func() {
        super.func()
        println("BBB")
    }
}

fun main() {
    AAA().func()
    BBB().func()
}

/*
override 키워드는 그 자체로 open 키워드가 포함
즉, override된 멤버 함수는 서브클래스에서 몇 번이고 재오버라이딩 가능!
멤버 함수의 재 오버라이딩을 막으려면 아래 예시처럼 final 키워드를 사용해야함
*/
open class CCC {
    open fun hello() = Unit
}

open class DDD : CCC() {
    // final을 붙여 더 이상 hello를 오버라이딩할 수 없게 만든다.
    final override fun hello() = super.hello()
}

open class EEE : DDD() {
    // 에러 => 'hello' in 'DDD' is final and cannot be overridden
    // override fun hello(){}
}