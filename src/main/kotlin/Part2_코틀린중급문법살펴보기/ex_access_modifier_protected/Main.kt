package Part2_코틀린중급문법살펴보기.ex_access_modifier_protected

/*
[접근 지정자: protected]
* */

// AAA 클래스를 상속이 가능하도록 선언
// number 프로퍼티를 protected로 선언하여 클래스 내부, 서브 클래스에서 접근 가능
open class AAA(protected val number: Int)

class BBB(number: Int): AAA(number) {
    fun printNumber() {
        // AAA 클래스의 number 프로퍼티에 접근 가능
        println(number)
    }
}

fun main() {
    val test = BBB(36)
    // println(test.number) // 에러
    test.printNumber()
}