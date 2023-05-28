package part4_코틀린표준라이브러리살펴보기.ex_mutable_list_iterator_interface

/*
[MutableListIterator 인터페이스 살펴보기]
 - MutableListIterator<T> 인터페이스는 ListIterator<T>와 MutableIterator<T> 인터페이스를 구현

 - MutableListIterator<T>에서 추가된 멤버는 다음과 같다.
  1) abstract fun set(element: T): Unit
   : set은 커서가 가리키는 위치의 원소를 element로 교체한다.

  2) abstract fun add(element: T): Unit
   : add는 커서가 가리키는 위치에 element를 추가한다.
* */

fun main() {
    val list = mutableListOf(1, 2, 3)
    val iter: MutableListIterator<Int> = list.listIterator()

    println(list) // [1, 2, 3]

    // next를 두 번 호출하여 iter 커서가 1번째를 가리키도록 하고 있음
    iter.next(); iter.next()
    iter.add(7) // [1, 2, 7, 3]
    println(list)

    // 커서를 다음 원소로 옮긴 뒤 값을 10으로 수정
    iter.next(); iter.set(10)
    println(list) // [1, 2, 7, 10]
}