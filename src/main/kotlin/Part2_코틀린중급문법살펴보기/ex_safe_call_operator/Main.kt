package Part2_코틀린중급문법살펴보기.ex_safe_call_operator

import Part2_코틀린중급문법살펴보기.ex_member_function.Building

/*
[안전한 호출 연산자 ?.]
    - Nullable한 참조 변수의 프로퍼티나 멤버 함수에 접근하려면 . 대신 ?. 연산자를 사용해야한다.
        ?.은 null 값에 안전한 연산자이다.

        참조 변수가 null이면 참조 변수?.프로퍼티 표현식이 null 값을 갖게 된다.
            참조 변수?.프로퍼티

        멤버 함수의 경우 참조 변수가 null일 때 멤버 함수를 호출하지 않으며,
        참조 변수?.멤버 함수() 표현식은 null이 된다.
            참조 변수?.멤버 함수()
* */

fun main() {
    var obj: Building? = null
    obj?.print() // obj에 null이 지정되어 있어 멤버 함수 호출 무시됨
    obj?.name = "건물" // obj에 null이 지정되어 있어 프로퍼티에 값을 집어넣는 동작 무시(Getter/Setter 함수 호출이기 때문에)

    obj = Building()
    obj?.name = "서울월드컵경기장"
    obj?.date = "2001년 11월 10일"
    obj?.area = 21_6712
    obj?.print()

}