package Part1

/*
[지역변수와 전역변수]
    전역 변수는 어떤 함수에도 속하지 않기 때문에 모든 함수에서 사용 가능
    지역 변수는 그 변수가 속한 지역, 즉 변수가 선언된 블록 안에서만 인식
     해당 범위를 Scope라고 함
*/

var count = 0 // 전역변수

fun main(args: Array<String>): Unit {
    val a = 15 // 지역변수
    println(a)

    count += 1
    printCount()
    println(count)
}

fun printCount() {
    println(count)
    count += 1
}
