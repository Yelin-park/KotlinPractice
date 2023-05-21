package part3_코틀린고급문법살펴보기.ex_array

/*
[배열]
 - 배열은 arrayOf 함수를 통해서 만들 수 있음

 - size 프로퍼티 : 배열의 원소 개수를 나타냄
   get/set 연산자 멤버 함수 : 배열을 [] 연산자로 접근할 수 있게 해줌
   iterator 연산자 멤버 함수 : 배열을 for 문에 쓸 수 있게 해줌
* */

fun main() {
    val integers: Array<Int> = arrayOf(10, 20, 30, 40)

    println(integers.size)
    println(integers[1])

    for(i in integers)
        println("$i")
}