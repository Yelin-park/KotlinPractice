package Part2_코틀린중급문법살펴보기.ex_secondary_constructor

/*
[보조 생성자]
    - 생성자는 여러 개를 둘 수 있으며, 문법은 아래와 같다.
    class 클래스 이름 constructor(매개변수) {
        // 보조 생성자1
        constructor(매개변수): this(인수) {
        }

        // 보조 생성자2
        constructor(매개변수): this(인수) {
        }
    }

    - 클래스 이름 옆에 오는 생성자는 주 생성자라고 한다.
        클래스 내부에 오는 생성자는 보조 생성자라고 하며, 여러 개가 올 수 있다.
* */

class Time(val second: Int) { // 프로퍼티를 선언 및 초기화하는 주 생성자
    init {
        println("init 블록 실행 중")
    }
    
    // 보조 생성자1
    constructor(minute: Int, second: Int): this(minute * 60 + second) {
        println("보조 생성자1 실행 중")
    }
    
    // 보조 생성자2
    constructor(hour: Int, minute: Int, second: Int): this(hour * 60 + minute, second) {
        println("보조 생성자2 실행 중")
    }
    
    init {
        println("또 다른 init 블록 실행 중")
    }
}

fun main() {
    // 보조 생성자1이 호출되고 연이어 주 생성자가 곧바로 호출되어 init 블록들이 가장 먼저 수행
    // 주 생성자가 끝나면 본격적으로 보조 생성자1의 코드가 실행
    println("${Time(15, 6).second} 초")
    // 보조 생성자2가 호출되고 연이어 보조 생성자1 호출, 연이어 주 생성자 호출. init 블록들 수행
    println("${Time(6, 3, 17).second} 초")
}

