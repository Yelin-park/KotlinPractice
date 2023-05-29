package part4_코틀린표준라이브러리살펴보기.ex_mutable_set_interface

/*
[MutableSet 인터페이스 살펴보기]
 - mutableSetOf 함수를 호출하면 MutableSet<E> 타입의 객체가 반환

 - MutableSet<E> 인터페이스는 MutableCollection<E>를 상속하며, 따로 추가된 멤버는 없다.
* */

fun main() {
    val set: MutableSet<Int> = mutableSetOf(1, 5, 7)
    println(set) // [1, 5, 7]

    println(set.add(5)) // false
    println(set) // [1, 5, 7]

    println(set.addAll(listOf(3, 7))) // true
    println(set) // [1, 5, 7, 3]
}