package Part2_코틀린중급문법살펴보기.ex_garbage_collection

/*
[가비지 컬렉션]
    힙 영역 어딘가에 존재하지만 위치를 모르기 때문에 다시는 찾을 수 없는 미아가 된 객체는
    메모리 공간이 부족해질 정도까지 쌓이면 가비지 컬렉션이라고 하는 기능에 의해 소멸된다.

    가비지 컬렉션이 일어날 때는 삭제할 미아 객체들을 탐색해야 하기 때문에
    순간적으로 프로그램이 멈추는 현상(프리징)이 일어날 수 있다.
*/

fun main(args: Array<String>): Unit {
    var result = ""
    var i = 1

    while(i <= 100) {
        result += "$i "
        i += 1
    }

    println(result)
}