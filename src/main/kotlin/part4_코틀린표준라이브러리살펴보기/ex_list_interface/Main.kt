package part4_코틀린표준라이브러리살펴보기.ex_list_interface

/*
[List 인터페이스 살펴보기]
 - List 인터페이스는 다음과 같이 선언되어 있다.
    interface List<out E>: Collection<E>

 - List 인터페이스는 다음과 같은 추상 멤버 함수를 가지고 있다.
   1) abstract operator fun get(index: Int): E
    : get은 List의 index 번째 원소를 반환하는 멤버 함수이다.
      List에 [] 연산자를 쓸 수 있도록 하는 역할도 한다.
   
   2) abstract fun indexOf(element: E): Int
    : indexOf은 element 원소가 List의 몇 번째 인덱스에 위치해있는지를 반환하는 멤버 함수이다.
      만약, element에 해당하는 원소가 없으면 -1을 반환. 동일한 원소가 여러 개 있으면 첫 번째로 일치하는 원소의 인덱스를 반환

   3) abstract fun lastIndexOf(element: E): Int
    : lastIndexOf 멤버 함수는 마지막으로 일치하는 원소의 인덱스를 반환(indexOf과 동일)
   
   4) abstract fun listIterator(): ListIterator<E>
      abstract fun listIterator(index: Int): ListIterator<E>
     : listIterator는 List에 특화된 Iterator를 반환하는 멤버 함수.
       index 매개변수에 값을 지정하면, 그 인덱스부터 시작하는 ListIterator를 반환
   
   5) abstract fun subList(fromIndex: Int, toIndex: Int): List<E>
    : subList는 [fromIndex, toIndex] 구간의 원소를 뽑아 새로운 List를 만들어 반한하는 멤버 함수
* */

fun main() {
    val list: List<Double> = listOf(20.18, 1.14, 9.15, 1.14)

    println(list[0]) // 20.18
    println(list.indexOf(1.14)) // 1
    println(list.indexOf(9.31)) // -1
    println(list.lastIndexOf(1.14)) // 3
    println(list.subList(0, 3)) // [20.18, 1.14, 9.15]
}