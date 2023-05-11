package Part2_코틀린중급문법살펴보기.ex_access_modifier

/*
[접근 지정자]
public : 모든 곳에서 접근 가능. 생략시 기본 접근 지정자
internal : 같은 모듈 안에서 접근 가능. 여기서 모듈은 IntelliJ 프로젝트의 모듈을 가리킴.
protected : 클래스 내부와 서브 클래스 안에서만 접근 가능
private : 프로퍼티와 멤버 함수일 경우, 해당 클래스 안에서만 접근 가능. 그 외의 경우 같은 파일 내에서만 접근 가능
* */

class Rectangle(private val width: Int, private val height: Int) {
    val area: Int
        get() = width * height
}

fun main() {
    val rect = Rectangle(5, 7)
    // println(rect.width) // 에러 발생
    println(rect.area)
}

/*
접근 지정자 class 식별자 접근 지정자 constructor() {
    접근 지정자 val[var] 식별자
        접근 지정자 get() =
        접근 지정자 set(value) =

    접근 지정자 constructor(): this()

    접근 지정자 fun 식별자
}

// 전역 변수에만 접근 지정자 지정 가능
접근 지정자 val[var]

접근 지정자 fun 식별자()
 */