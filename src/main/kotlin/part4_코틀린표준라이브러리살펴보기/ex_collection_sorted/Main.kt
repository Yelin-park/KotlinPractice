package part4_코틀린표준라이브러리살펴보기.ex_collection_sorted

/*
[컬렉션 정렬하기]
 - sorted 계열의 확장 함수를 이용하면 컬렉션 내의 원소를 정렬할 수 있다.
 
 - sorted 함수는 오름차순으로 정렬된 List<T>를 반환한다.
   이때, 각 원소는 반드시 Comparable<T>를 구현하고 있어야 한다.
   비교가 가능해야 정렬이 가능하기 때문
   
 - sortedDescending 함수는 내림차순으로 정렬된 List<T>를 반환
* */

fun main() {
    val list = listOf(43, 76, 28, 19, 22, 68)

    println(list.sorted()) // [19, 22, 28, 43, 68, 76]
    println(list.sortedDescending()) // [76, 68, 43, 28, 22, 19]
}