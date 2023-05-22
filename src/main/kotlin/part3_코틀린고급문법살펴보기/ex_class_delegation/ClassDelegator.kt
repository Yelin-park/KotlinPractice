package part3_코틀린고급문법살펴보기.ex_class_delegation

/*
[클래스 위임]
* */

// Plusable 인터페이스를 구현
class ClassDelegator: Plusable {
    override fun plus(other: Int): Int {
        println("기본 구현")
        return other
    }
}