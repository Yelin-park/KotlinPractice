package Part2_코틀린중급문법살펴보기.ex_this_duplication

/*
[프로퍼티와 멤버 함수의 매개변수 이름이 중복될 때]
    변수 이름을 그냥 적으면 이 변수는 매개변수로 인식
    변수 앞에 this를 붙이면 이 변수는 프로퍼티로 인식된다.
*/

class AAA {
    var num = 15

    fun memberFunc(num: Int) {
        println(num) // 매개변수
        println(this.num) // 프로퍼티
    }
}

fun main(args: Array<String>): Unit {
    val a = AAA()
    a.memberFunc(53)
}
