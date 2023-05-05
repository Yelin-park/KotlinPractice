package Part2_코틀린중급문법살펴보기.ex_memory_heap

/*
[메모리의 힙 영역]
    스택 영역에 args 다음에 person 변수가 쌓인다.
    그 다음 object{..} 부분이 실행되어 힙 영역에 객체가 생성된다.

    변수가 차곡차곡 쌓이는 형태인 스택 영역과는 달리, 힙 역영에는 임의의 위치에 객체가 생성된다.
    어떤 객체의 프로퍼티에 값을 저장하거나 저장된 값을 가져오고 싶으면, 그 객체의 힙영역상 좌표를 알고 있어야 한다.
    object{..} 표현식은 힙 영역에 객체를 생성하며, 갓 생성된 객체의 좌푯값을 갖는다.
      -> (표현식이라 person 변수에 대입이 가능.
         단, object 표현식은 타입 이름을 갖지 않는다. 타입이 존재하기는 하지만
         컴파일러가 내부용으로만 타입 이름을 짓기 때문에 그 이름을 알수는 없다.)

    person 변수에는 객체의 좌표를 저장하기 위한 공간만 존재하며,
    person 처럼 실제 값을 가지지 않고 객체의 좌표만 저장하는 변수를 '참조 변수(Reference Variable)'라고 한다.
    객체의 좌푯값은 참조값(Reference Value)
*/

fun main(args: Array<String>): Unit {

    val person = object {
        val name: String = "홍길동"
        val age: Int = 36
    }

    /*
    [스택 영역]      [힙 영역]
    person  -----> name | "홍길동"
                   age | 36
     */

    println(person.name)
    println(person.age)

}