package Part1

/*
[지역 변수와 다른 함수의 지역 변수가 중복될 때]
    지역 변수의 이름은 같은 스코프 내에서만 중복되지 않으면 되기 때문에 서로 다른 함수 안에
    같은 이름의 변수가 존재할 수 있다.
*/

fun main(args: Array<String>): Unit {
    val a = 52
    println(a)

    pritntA()
    pritntA2()
}

fun pritntA() {
    val a = 17
    println(a)
}

fun pritntA2() {
    val a = 120
    println(a)
}
