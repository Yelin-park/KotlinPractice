package part3_코틀린고급문법살펴보기.ex_nested_class

/*
[중첩 클래스]
 - 클래스 안에는 또 다른 클래스를 선언할 수 있다.

 - 중첩 클래스는 타입 이름이 '바깥 클래스.중첩 클래스'로 만들어진다.
 
 - 바깥 클래스와 중첩 클래스의 인스턴스는 서로 어떠한 프로퍼티나 멤버 함수도 공유하지 않는 완전히 별개의 클래스
   단순히 식별자만 바깥 클래스에 속해있는 것
* */

class Outher { // 바깥 클래스
    class Nested { // 중첩 클래스
        fun hello() = println("중첩된 클래스")
    }
}

fun main() {
    val instance: Outher.Nested = Outher.Nested()
    instance.hello()
}

// 다음 코드는 오류를 일으킴
/*
class Outer2 {
    private val property: Int = 16
    class Nested2 {
        fun hello() = println(property) // Unresolved reference: property (알수 없는 참조: property)
    }
}
 */