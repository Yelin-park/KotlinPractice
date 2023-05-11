package Part2_코틀린중급문법살펴보기.ex_access_modifier_overriding

/*
[접근 지정자 오버라이딩]
 - 오버라이딩을 통해 protected인 프로퍼티나 멤버 함수의 접근 지정자를 public으로 변경할 수 있다.
 - private 접근 지정자는 open 키워드 자체를 사용할 수 없으며, 오버라이딩도 불가능하다.
* */

open class AAA(protected open val number: Int) {
    protected open fun hello() {
        println("hello")
    }
}

class BBB(number: Int): AAA(number) {
    public override val number: Int
        get() = super.number

    public override fun hello() = super.hello()
}

fun main() {
    val b = BBB(2)
    val a: AAA = b

    //println(a.number) // 에러 Kotlin: Cannot access 'number': it is protected in 'AAA'
    //a.hello() // 에러
    println(b.number)
    b.hello()
}