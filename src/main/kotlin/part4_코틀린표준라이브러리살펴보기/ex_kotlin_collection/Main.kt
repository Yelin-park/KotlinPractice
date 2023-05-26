package part4_코틀린표준라이브러리살펴보기.ex_kotlin_collection

/*
[코틀린의 컬렉션]
 - 컬렉션이란? 프로그램을 개발하는데 필요한 기본적인 자료구조들을 통칭하는 말이다.
 
 - 코틀린에는 크게 3가지 컬렉션이 있다.
    1) List : 순서가 있는 목록을 표현하는 자료구조. 동적 배열이나 연결 리스트가 여기에 포함된다.
    2) Set : 집합을 표현하는 자료구조. 원소의 중복을 허용하지 않으며, 각 원소는 순서를 갖지 않는다.
    3) Map : 연관 배열을 표현하는 자료구조. 키와 값을 1:1 대응시켜 저장, 키는 중복될 수 없음

 - list와 set은 Collection 인터페이스를 상속, Map은 독자적인 인터페이스다.
* */

fun main() {
    val list: Collection<Int> = listOf(10, 20, 10)
    val set: Collection<Int> = setOf(1, 2, 3, 2, 3)
    val map: Map<String, String> = mapOf("Apple" to "사과", "Banana" to "바나나")

    println(list) // [10, 20, 10]
    println(set) // [1, 2, 3]
    println(map) // {Apple=사과, Banana=바나나}
}