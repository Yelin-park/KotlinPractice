package Part1
/*
식별자는 키워드를 제외한 영문자, 숫자, 언더스코어(_)로만 지을 수 있으며, 숫자가 맨 앞에 오면 안됨
자바와 달리 $도 사용할 수 없음


자바와 다르게 코틀린은 원시타입(자료형)이 없다.
즉, Int와 같은 기본 타입들도 모두 클래스

var : 변수 키워드(
val : 변수 키워드(한번 값을 저장하면 나중에 값을 수정할 수 없음)
* var는 일반 변수, val는 final 변수로 생각하기!
total | a | b : 변수 이름(식별자)
Int : 변수의 타입
 */
fun main(args: Array<String>): Unit
{
    var total:Int
    total = 0

    var a:Int = 10+53-7
    println(a)

    var b:Int = 43+75+a
    println(b)

    total = a + b
    println(total)

}