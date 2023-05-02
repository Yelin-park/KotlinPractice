package Part1

/*
[함수]
    - 함수 선언 양식
        fun 식별자(): 반환타입 {
            함수에 포함시킬 문장
        }

    - 함수를 선언하는 위치는 main을 기준으로 어디에 있어도 상관없음

    - 함수를 호출할 때는 함수 속에 들어있던 문장들이 순차적으로 실행(호출 call)
      한 줄에 여러 개의 함수 호출이 있을 때는 가장 안쪽에 있는 함수가 먼저 호출된다.

*/
fun main(args: Array<String>): Unit {
    println(myFunction())
    println(myFunction() + 10)
}

fun myFunction(): Int {
    val a = 3
    val b = 6
    println("a: " + a + ", b: " + b)
    return a + b
}

// 함수 블록의 문장이 하나일 경우 한 줄로 축약할 수 있다.
fun function(): Double {
    return 3.0 + 7
}

fun function2(): Double = 3.0 + 7

// 타입을 추론해낼 수 있으므로 함수의 반환 타입까지 생략 가능
fun function3() = 3.0 + 7
