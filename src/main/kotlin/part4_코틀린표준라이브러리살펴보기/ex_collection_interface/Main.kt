package part4_코틀린표준라이브러리살펴보기.ex_collection_interface

/*
[Collection 인터페이스 살펴보기]
 - Collection 인터페이스는 다음과 같이 선언됨
       interface Collection<out E>: Iterable<E>
   > Iterable<E>는 fun iterator(): Iterator<E> 멤버 함수를 컬렉션에 주입하기 위한 인터페이스이다.

 - Collection 인터페이스는 한 개의 추상 프로퍼티와 네 개의 추상 멤버 함수를 갖고 있다.
 1) abstract val size: Int
   : size는 컬렉션에 포함된 원소의 개수를 갖는 프로퍼티
 
 2) abstract fun isEmpty(): Boolean
   : isEmpty는 컬렉션이 비어있는지 여부를 반환하는 멤버 함수

 3) abstract operator fun contains(element: E): Boolean
   : contains는 element 원소가 컬렉션에 포함되어 있는지 여부를 반환하는 연산자 멤버 함수.
     컬렉션에 in 연산자를 쓸 수 있도록 하는 역할도 한다.

 4) abstract fun containsAll(element: Collection<E>): Boolean
   : containsAll은 elements의 원소들이 컬렉션에 모두 포함되어 있는지 여부를 반환하는 연산자 멤버 함수.

 5) abstract fun iterator(): Iterator<E>
  : iterator는 컬렉션의 각 원소를 순회하는 Iterator<E> 타입의 객체를 반환하는 연산자 멤버 함수.
    컬렉션을 for 문의 in 연산자에 사용할 수 있도록 해준다.
* */

fun main() {
    val list: Collection<Int> = listOf(18, 1, 1, 4)

    println(list.size) // 4
    println(list.isEmpty()) // false
    println(18 in list) // true

    for(i in list)
        print("$i ") // 18 1 1 4
}