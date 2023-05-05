package Part2_코틀린중급문법살펴보기.ex_member_function

/*
[멤버함수]
 객체는 동작도 갖는다.
 멤버 함수가 바로 객체의 동작 역할을 한다.

 + 코틀린에 존재하는 모든 타입은 클래스이다.
   즉, Byte, Short, Int, Long, Float, Double, Char, Boolean 같이 스택에
   실제 값이 저장되는 타입들도 모두 클래스이다.
   기본 타입이 클래스로 선언된 것은, 기본 타입에서 호출할 수 있는 멤버 함수를 코틀린 문법적으로
   확실히 하기 위한 장치일 뿐, 그 자체로 어떤 코드를 담고 있는 것은 아니다.
   기본 타입은 클래스의 형태를 하고 있어도 사용자 정의 클래스와는 엄연히 다르다.
*/

fun main(args: Array<String>): Unit {
    val building = Building()
    building.name = "A 오피스텔"
    building.date = "2017-12-13"
    building.area = 120 * 8

    // building 객체(building 참조 변수가 가리키는 인스턴스)를 통해 print 멤버 함수를 호출
    // print 멤버 함수 안의 this는 이 building 객체로 치환된다.
    building.print()
}