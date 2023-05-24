package part4_코틀린표준라이브러리살펴보기.ex_progression_practice

/*
[Progression과 관련된 함수]
 - downTo는 역순으로 진행하는 Progression을 반환하는 infix 확장 함수
   참고) .. 연산자는 작은 값..큰 값으로 사용(왼쪽 피연산자가 오른쪽 피연산자보다 크면 비어있는 구간으로 인식됨)
 
 - reversed 확장 함수는 원래의 Progression을 뒤집는 역할을 함
 
 - step 확장 함수는 원래의 Progression에 step 프로퍼티 값만 바꿔주는 역할을 함
   !step에 전달되는 값은 항상 양수여야함!
   양수를 전달해도 Progression 자체가 역순으로 진행되고 있으면 step 프로퍼티는 자연스럽게 음수가 됨

 - until은 [시작, 끝]로 진행하는 Progression을 반환하는 확장 함수이다.
* */

// IntProgression의 상태를 출력하는 함수 선언
fun IntProgression.print() {
    print("first: ${this.first}, ")
    print("last: ${this.last}, ")
    println("step: ${this.step}")

    for(i in this)
        print("$i ")
    println("\n")
}

fun main() {
    val prog: IntProgression = 7 downTo 3
    prog.print()
    /*first: 7, last: 3, step: -1
    7 6 5 4 3*/

    val prog2: IntProgression = (3..7).reversed()
    println(prog == prog2) // true
    prog2.print()
    /*first: 7, last: 3, step: -1
    7 6 5 4 3*/

    val prog3: IntProgression = (1..10) step 3
    prog3.print()
    /*first: 1, last: 10, step: 3
    1 4 7 10*/

    val prog4: IntProgression = 10 downTo 2 step 3
    prog4.print()
    /*first: 10, last: 4, step: -3
    10 7 4*/

    val prog5: IntProgression = 2 until 5
    prog5.print()
    /*first: 2, last: 4, step: 1
    2 3 4*/
}