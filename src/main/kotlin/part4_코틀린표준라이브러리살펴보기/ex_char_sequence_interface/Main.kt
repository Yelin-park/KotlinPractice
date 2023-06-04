package part4_코틀린표준라이브러리살펴보기.ex_char_sequence_interface

/*
[CharSequence 인터페이스: 문자열과 관련된 클래스가 구현하는 뼈대 인터페이스]
 - CharSequence는 String, StringBuilder 등 문자열과 관련된 클래스들이 구현하는 기본적인 뼈대 인터페이스
 
 - length 멤버 함수는 문자열의 길이, 즉 문자열에 포함된 문자의 개수를 갖는 프로퍼티
 - get 멤버 함수는 문자열의 문자 하나를 [] 연산자로 접근할 수 있게 해주는 연산자 멤버 함수
 - subSequence 멤버 함수는 (startIndex, endIndex) 구간의 문자열을 뽑아 새 CharSequence로 반환
* */

fun main() {
    val seq: CharSequence = "Hello"
    println(seq.length)
    println(seq[2])
    println(seq.subSequence(1, 4))
}