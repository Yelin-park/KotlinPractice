package Part2_코틀린중급문법살펴보기.ex_overriding_property

/*
[프로퍼티를 오버라이딩하기]
    - 프로퍼티에도 함수의 일종인 Getter/Setter가 존재하므로, 이들도 오버라이딩 가능
    - 프로퍼티를 오버라이딩하기 위해서는 open 키워드를 사용
    - 프로퍼티를 오버라이딩할 때도 override 키워드 사용
* */

open class AAA {
    // number 프로퍼티에 open 키워드 붙임. Getter와 Setter를 커스터마이징
    open var number = 10
        get() {
            println("AAA number Getter 호출됨")
            return field
        }
        
        set(value) {
            println("AAA number Setter 호출됨")
            field = value
        }
}

class BBB : AAA() {
    // AAA 클래스의 number 프로퍼티를 오버라이딩
    override var number: Int
        get() {
            println("BBB number Getter 호출됨")
            return super.number
        }

        set(value) {
            println("BBB number Setter 호출됨")
            super.number = value
            
        }
}

// 슈퍼클래스에서 val로 선언한 프로퍼티를 var로 오버라이딩할 수 있다.
open class CCC(open val number: Int = 0)

class DDD: CCC() {
    override var number: Int = 0
        get() = super.number
        set // 디폴트 Setter
}

fun main() {
    val test = BBB()
    test.number = 5
    test.number

    var test2 = DDD()
    test2.number = 10
    test2.number
}