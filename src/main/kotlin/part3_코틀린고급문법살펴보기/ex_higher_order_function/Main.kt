package part3_코틀린고급문법살펴보기.ex_higher_order_function

/*
[고차 함수]
 - 함수 리터럴은 보통 고차 함수를 위해 사용된다.
   고차 함수란? 인수로 함수를 받거나, 함수를 반환하는 함수를 뜻한다.
   고차 함수는 다음의 코드와 같은 상황에 유용하게 사용할 수 있음
    println("=== 작업 시작 ===")
    val a = 10
    val b = 5
    println("$a + $b = ${a + b}")
    println("=== 작업 끝 ===")

    println("=== 작업 시작 ===")
    println("some")
    println("task")
    println("=== 작업 끝 ===")
 
 - 만약, 고차 함수의 마지막 매개변수 타입이 함수 타입이라면, 함수 호출시 소괄호를 생략할 수 있다.
    ex) decorator({...})을 decorator{...}로 써도 됨

   고차 함수의 매개변수가 여러 개이고, 함수 타입의 매개변수가 맨 마지막에 온다면,
   일반 인수들만 소괄호로 감싸고, 함수 리터럴은 바깥으로 뺄 수 있다.
    ex) decorator(인수1, 인수2, ...) {...}
* */

// () -> Unit 타입의 함수를 인수로 받는 고차 함수 decorate 선언
fun decorate(task:() -> Unit) {
    println("=== 작업 시작 ===")
    task() // task 매개변수가 가리키는 함수를 호출하고 있다.
    println("=== 작업 끝 ===")
}

fun main() {
    // decorate 함수에 함수 리터럴을 인수로 전달하고 있다.
    decorate({
        val a = 10; val b = 5
        println("$a + $b = ${a + b}")
    })
    decorate({
        println("some"); println("task")
    })
}