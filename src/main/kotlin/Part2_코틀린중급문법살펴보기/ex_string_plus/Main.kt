package Part2_코틀린중급문법살펴보기.ex_string_plus

/*
[문자열간 + 연산 시 주의점]
    Person, Product 타입처럼 스택이 아닌 힙 영역에 실제 공간이 할당되는 타입을 참조 타입이라고 한다.
    코틀린에서 Byte, Short, Int, Long, Float, Double, Char, Boolean 타입을 제외한 타입은
    모두 참조 타입이다.

    실제 문자열은 힙 영역에 생성되며, String 변수는 문자열의 참조값을 저장하기 위한 공간만 갖고 있다.
*/

fun main(args: Array<String>): Unit {
    /*
    [스택 영역]         [힙 영역]
    args
    first    ----->   "Hello "
    second   ----->   "World"
     */
    var first = "Hello "
    var second = "World"

    /*
    [스택 영역]         [힙 영역]
    args              "Hello "
    first    ----->   "Hello World"
    second   ----->   "World"

    first 변수에 first와 second가 가리키는 문자열을 합쳐 저장
    문자열끼리 + 연산을 하면 원래 갖고 있던 문자열에 새로운 문자열이 덧붙여지는 게 아니라
    기존의 문자열은 그대로 남고 합쳐진 문자열이 새로 생성된다.
    따라서 "Hello "는 힙영역에서 사라지지 않고 다시 접근할 방법도 전혀 없다.
    이러한 문제는 가비지 컬렉션으로 해결!
    */
    first += second

}