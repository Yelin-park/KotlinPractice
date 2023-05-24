package part4_코틀린표준라이브러리살펴보기.ex_iterable_interface

/*
[Iterable 인터페이스: 클래스가 반복자를 지원하도록 하기]
 - IntRange는 IntProgression과 ClosedRange 인터페이스를,
   LongRange는 LongProgression과 ClosedRange 인터페이스를
   CharRange는 CharProgression과 ClosedRange 인터페이스를 구현한다.

 - 각각 Iterable<Int>, Iterable<Long>, Iterable<Char>을 상속하며,
   이 인터페이스 덕에 Int/Long/CharRange의 인스턴스를 for문의 in 연산자에 쓸 수 있다.

 - 각 Progression에는 다음과 같은 프로퍼티가 있음
  open class IntProgression {
   val first: Int
   val last: Int
   val step: Int
  }
   > first와 last는 Progression의 시작 값과 끝 값을 가리키는 프로퍼티이다.
   > start와 endInclusive가 있는데 first와 last를 선언한 이유는?
     Progression은 큰 수에서 작은 수로 진행할 수도 있기 때문
     즉, ClosedRange는 1~10처럼 작은수~큰수 형태로 밖에 표현이 안되지만
     Progression은 10~1처럼 큰수~작은수 형태로 표현 가능
   > step은 반복자의 next를 호출할 때, 몇 칸씩 건너뛸 것인지를 나타내는 프로퍼티이다.
* */

fun main() {
    val prog: IntProgression = 3..7
    println(prog.first) // 3
    println(prog.last) // 7
    println(prog.step) // 1

    for(i in prog)
        print("$i ") // 3 4 5 6 7
}