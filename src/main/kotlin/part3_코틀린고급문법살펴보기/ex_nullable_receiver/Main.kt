package part3_코틀린고급문법살펴보기.ex_nullable_receiver

/*
[Nullable 리시버]
 - 확장 함수를 응용하면, 참조 변수에 null이 지정되어 있어도 함수 호출이 가능하게 할 수 있다.
   (Nullable 타입으로도 멤버 함수를 호출할 수 있다.)
 
 - 리시버 타입에 ?가 붙어 있는 것이 Nullable 리시버
* */

fun String?.isNumber(){
    if(this == null) {
        println("문자열이 null입니다.")
    }
}

fun main() {
    val empty: String? = null
    empty.isNumber()
}