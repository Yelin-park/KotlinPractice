package Part2_코틀린중급문법살펴보기.ex_any_class

/*
[Any 클래스]
* */

fun main() {
    val building = Building("코틀린", area = 100)
    /*
    코드 상으로는 Any 타입의 toString 멤버 함수를 호출하고 있지만,
    다형성 덕에 실제로는 building 객체의 toString() 호출
    */
    printObject(building)
}

fun printObject(any: Any) {
    println(any.toString())
    /* println 함수는 전달한 인수가 String 타입이 아니면
     내부적으로 println(any.toString()) 호출하기 때문에 아래와 같이 사용해도 됨 */
    println(any)
}
