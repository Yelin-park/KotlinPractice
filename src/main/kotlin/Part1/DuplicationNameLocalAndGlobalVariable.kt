package Part1

/*
[지역변수와 전역변수의 이름이 중복될 때]
    Scope가 다르면 변수의 이름이 중복될 수 있음
*/

var a = 5 // 전역 변수

fun main(args: Array<String>): Unit {
    val a = 30 // 지역 변수
    println(a)
    func()
}

fun func() {
    println(a)
}


