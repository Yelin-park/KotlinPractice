package Part2_코틀린중급문법살펴보기.ex_object

/*
[객체(object)]
    object에 포함된 변수 : 프로퍼티(property) == 속성

    코틀린의 프로퍼티는 자바의 필드와 동일해 보이지만 같지 않다.
    프로퍼티는 필드와 Getter, Setter가 합쳐진 개념이다.
*/

fun main(args: Array<String>): Unit {

    // person 변수에 object(객체)를 저장
    val person = object {
        /* object에 포함된 변수들은 선언과 동시에 초기화
           object에 포함된 변수들은 프로퍼티(property) == 속성 이라고 부른다.
           프로퍼티는 반드시 선언과 동시에 초기화를 해야함 */
        val name: String = "홍길동"
        val age: Int = 36
    }

    println(person.name)
    println(person.age)

}