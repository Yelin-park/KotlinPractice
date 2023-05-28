package part4_코틀린표준라이브러리살펴보기.ex_mutable_iterator_interface

/*
[MutableIterator 인터페이스 살펴보기]
 - MutableIterator 인터페이스는 다음과 같이 선언
    public interface MutableIterator<out T>: Iterator<T> {
     public fun remove(): Unit
    }
   : 커서가 가리키고 있는 원소를 삭제할 수 있는 멤버 함수 remove 추가
* */

fun main() {
    val list = mutableListOf(1, 2, 3)
    val iter: MutableIterator<Int> = list.iterator()

    println(list) // [1, 2, 3]

    // 반복자의 커서를 첫 번째 원소로 옮기기 위해 next 호출 후 remove 호출하여 첫 원소 삭제
    iter.next(); iter.remove()
    println(list) // [2, 3]

    iter.next(); iter.remove()
    println(list) // [3]
}