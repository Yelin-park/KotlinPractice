package part4_코틀린표준라이브러리살펴보기.ex_mutable_list_interface

/*
[MutableList 인터페이스 살펴보기]
 - mutableListOf 함수를 호출하면 MutableList<E> 타입의 객체가 반환된다.
   MutableList<E> 인터페이스는 MutableCollection<E>를 상속한다.

 - MutableList<E>에서 추가된 멤버들은 아래와 같다.
   1) abstract fun add(index: Int, element: E): Unit
    : add는 index 위치에 element를 추가하는 멤버 함수

   2) abstract fun addAll(index: Int, elements: Collection<E>): Boolean
    : addAll은 index  위치에 elements 컬렉션에 있는 모든 원소를 추가하는 멤버 함수
      List에 변경이 일어났으면 true를 반환한다.

   3) abstract operator fun set(index: Int, element: E): E
    : set은 [] 연산자를 오버로딩하는 멤버 함수이다.
      index번째 위치의 원소를 element로 교체한다.
      반환값은 이전에 index 위치에 있던 원소이다. 단, list[2] = 5 형태로 set을 호출할 땐느 반환값을 얻을 수 없다.

   4) abstract fun removeAt(index: Int): E
    : removeAt은 index번째 원소를 삭제하는 멤버 함수이다. 반환값은 삭제된 원소이다.
* */

fun main() {
    val list:MutableList<Char> = mutableListOf('c', 'a', 'z')
    println(list) // [c, a, z]

    list.add(1, '%')
    println(list) // [c, %, a, z]

    list.addAll(0, listOf('L', 'P'))
    println(list) // [L, P, c, %, a, z]

    println(list.set(2, '/')) // c
    println(list) // [L, P, /, %, a, z]

    println(list.removeAt(4)) // a
    println(list) // [L, P, /, %, z]
}