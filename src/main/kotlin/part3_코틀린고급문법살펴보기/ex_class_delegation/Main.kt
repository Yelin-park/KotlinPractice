package part3_코틀린고급문법살펴보기.ex_class_delegation

/*
[클래스 위임]
* */

fun main() {
    // Sample의 plus 연산자 멤버 함수를 호출하면 ClassDelegator의 plus가 호출됨
    println(Sample() + 10)
    /*
    기본 구현
    10
    */
}