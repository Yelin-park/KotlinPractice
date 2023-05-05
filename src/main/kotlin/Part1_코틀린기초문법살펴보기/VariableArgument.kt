package Part1_코틀린기초문법살펴보기

/*
[가변 인수]
    - 가변 인수는 개수가 정해지지 않은 매개변수를 만드는 방법이다.
      매개변수 앞에 vararg 키워드를 붙이면 여러 개의 인수를 받을 수 있다.
      가변 매개변수에는 아무 인수도 지정하지 않을 수 있다.

    - 가변 인수는 일반 인수와 함께 쓸 수도 있다.
      fun function(something: Char, vararg numbers: Int): Int
      아래와 같이 호출
      function(Char 타입 인수, N개의 Int 타입 인수)

    - 일반 인수가 가변 인수보다 오른쪽에 있으면 호출시 인수에 매개변수 이름을 붙여야 한다.
      fun function(vararg numbers: Int, something: Char): Int
      아래와 같이 호출
      function(N 개의 Int 타입 인수, something = Char 타입 인수)
*/

fun main(args: Array<String>): Unit {
    println(getSumOf(1, 2, 3, 4, 5, 6, 7))
    println(getSumOf(32, 57, 12))
    println(getSumOf())
}

fun getSumOf(vararg numbers: Int): Int {
    val count = numbers.size; // 인수의 개수를 저장
    var i = 0; var sum = 0

    while(i < count) {
        sum += numbers[i]
        i += 1
    }

    return sum
}

