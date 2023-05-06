package Part2_코틀린중급문법살펴보기.ex_property_getter_setter

/*
[프로퍼티와 Getter/Setter]
    프로퍼티는 실제로 데이터가 저장되는 공간(Field),
    저장된 값을 읽으려고 할 때 호출되는 함수(Getter),
    값을 저장하려고 할 때 호출되는 함수(Setter)로 이루어져 있다.
* */

fun main() {
    val person = Person()
    // 프로퍼티에 특정 값을 대입하면, 프로퍼티에 해당하는 setter가 호출
    person.age = -30
    // 프로퍼티에서 특정 값을 읽어오려 하면, 프로퍼티에 해당하는 getter가 호출
    println(person.age)
}