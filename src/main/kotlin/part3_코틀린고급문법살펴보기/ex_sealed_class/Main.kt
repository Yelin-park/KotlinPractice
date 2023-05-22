package part3_코틀린고급문법살펴보기.ex_sealed_class

/*
[sealed 클래스]
 - 1.1 버전 이후에는 sealed 클래스와 같은 파일에 속해 있기만해도 sealed 클래스를 상속할 수 있다.
* */

fun main() {
    val instance:Outer = Outer.Three()

    val test: Outer
    /*
    sealed 클래스는 서브클래스가 sealed 클래스 안에 모두 존재하므로,
    모든 서브 타입을 체크했다면 when의 else 블록을 생략해도 표현식을 구성할 수 잇다.
    */
    val text: String = when(instance) {
        is Outer.One -> "첫 번째"
        is Outer.Two -> "두 번째"
        is Outer.Three -> "세 번째"
    }

    println(text)
}