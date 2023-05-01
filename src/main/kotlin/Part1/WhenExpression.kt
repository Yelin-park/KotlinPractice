package Part1

/*
[when을 표현식으로 사용하기]
    when도 if처럼 else 블록을 포함하고 있다면 표현식이 된다
*/

fun main(args: Array<String>): Unit {
    val score = 95

    val grade: Char = when(score / 10) {
        6 -> 'D'
        7 -> 'C'
        8 -> 'B'
        9,10 -> 'A'
        else -> 'F'
    }

    println(grade)

    // when을 아래와 같이 사용할 수 있다(if-else처럼)
    val grade2: Char = when{
        score >= 90 -> 'A'
        score >= 80 -> 'B'
        score >= 70 -> 'C'
        score >= 60 -> 'D'
        else -> 'F'
    }

    println(grade2)

}