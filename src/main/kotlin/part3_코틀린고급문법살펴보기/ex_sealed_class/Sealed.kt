package part3_코틀린고급문법살펴보기.ex_sealed_class

/*
[sealed 클래스]
 - sealed 클래스는 자신의 중첩 클래스에만 상속을 허용하는 클래스이다.
* */

// Outer 클래스는 자신의 중첩 또는 내부 클래스에서만 상속이 가능하다. Outer 클래스 자체로는 인스턴스 생성 불가능
sealed class Outer {
    class One: Outer()
    class Two: Outer()
    class Three: Outer()
}
