package part4_코틀린표준라이브러리살펴보기.ex_mutable_collection_interface

/*
[변경할 수 있는(Mutable) 컬렉션]
 - Collection, List, Map 인터페이스에는 컬렉션에 원소를 추가하거나 삭제하는 멤버 함수가 없었음
   컬렉션의 원소를 수정하려면 MutableCollection 인터페이스를 구현하는 컬렉션을 이용해야 한다.
   * 컬렉션을 반드시 수정해야하는 상황이 아니라면 Mutable이 아닌 일반 Collection을 쓸 것을 권장.
    why? 이유는 변수 선언시 var 대신 val을 권장하는 이유와 동일.
         컬렉션을 수정할 수 있다면 컬렉션에 들어 있는 원소와 관련된 버그가 발생했을 때
         컬렉션을 어느 지점에서 수정하는지 일일이 찾아봐야 함

 - MutableCollection은 다음과 같이 선언
   interface MutableCollection<E> : Collection<E>, MutableIterable<E>
   
 - MutableIterable 인터페이스는 다음과 같이 선언
     interface MutableIterable<out T>: Iterable<T> {
      override fun iterator(): MutableIterator<T>
     }
   : MutableIterable<T> 인터페이스는 Iterable 인터페이스에 선언된 iterator 멤버 함수를 오버라이딩하여
    반환 타입을 MutableIterator<T>로 바꿔준다. MutableIterator<T>는 Iterator<T>를 상속하므로 문제 X
 
 - MutableIterable<T> 인터페이스는 다음과 같은 멤버를 갖고 있음
  1) abstract fun add(element: E): Boolean
    : add 멤버 함수는 컬렉션에 element 원소를 추가한다. 원소가 성공적으로 추가되었으면 ture 반환.
     만약, 컬렉션이 원소의 중복을 허용하지 않는다는 등의 이유로 우너소를 추가하지 못하면 false 반환

  2) abstract fun addAll(elements: Collection<E>): Boolean
   : addAll 멤버 함수는 elements 컬렉션의 모든 원소를 컬렉션에 추가.
    원소가 하나라도 추가되었으면 ture, 단 한개도 추가되지 않았으면 false 반환
    
  3) abstract fun remove(element: E): Boolean
   : remove 멤버 함수는 컬렉션에서 element와 일치하는 원소를 하나 제거.
    원소가 성공적으로 제거되면 true를, 해당하는 원소가 컬렉션에 없으면 false 반환

  4) abstract fun removeAll(elements: Collection<E>): Boolean
   : removeAll 멤버 함수는 elements 컬렉션의 원소들과 일치하는 모든 원소를 컬렉션에서 제거한다.
     원소가 하나라도 제거되면 true를, 없으면 false 반환

  5) abstract fun retainAll(elements: Collection<E>): Boolean
   : retainAll 멤버 함수는 elements 컬렉션의 원소와 일치하는 원소만 남기고 컬렉션에서 모두 제거한다.
    원소가 하나라도 제거되면 true를, 없으면 false 반환
  
  6) abstract fun clear()
   : clear는 컬렉션의 모든 원소를 삭제하는 멤버 함수
* */

fun main() {
    // Set과 Map은 mutableSetOf, mutableMapOf 함수를 호출해야함
    val mutableList: MutableCollection<Int> = mutableListOf(1, 2, 4, 2, 3, 2, 5)
    println(mutableList)

    mutableList.add(1)
    println(mutableList)

    mutableList.addAll(listOf(3, 2, 4))
    println(mutableList)

    mutableList.remove(1)
    println(mutableList)

    mutableList.removeAll(listOf(1, 2))
    println(mutableList)

    mutableList.retainAll(listOf(3, 5))
    println(mutableList)

    mutableList.clear()
    println(mutableList)
}