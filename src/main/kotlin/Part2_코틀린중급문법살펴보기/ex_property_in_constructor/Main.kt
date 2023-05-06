package Part2_코틀린중급문법살펴보기.ex_property_in_constructor

/*
[생성자와 프로퍼티 한번에 쓰기]
    생성자 매개변수 앞에 val이나 var 키워드를 붙이면 동일한 이름의 프로퍼티가 같이 선언된다.
* */

/* 매개변수 앞에 val이나 var 키워드를 붙이면, 동일한 이름의 프로퍼티가 같이 선언된다.
   그리고 생성자 매개변수에 들어온 인수가 프로퍼티의 초기값이 된다.
   speed 매개변수에는 디폴트 인수를 지정 */
class Car(val name: String, val speed: Int = 0)

fun main(args: Array<String>): Unit {
    val car = Car("Niro HEV")
    println(car.name)
    println(car.speed)

    val car2 = Car("Sportage HEV", 130)
    println(car2.name)
    println(car2.speed)
}