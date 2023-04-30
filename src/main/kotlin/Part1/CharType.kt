package Part1
/*
[문자 타입]
*/
fun main(args: Array<String>): Unit
{
    var ch: Char = 'A'
    println(ch)

    // 코틀린에서 \u 다음 4자리의 16진수를 입력하면 그 번호에 해당하는 문자로 치환
    ch = '\uAC00'
    println(ch)

    ch = '한'
    println(ch.toInt()) // .code로 사용해도 해당 문자의 유니코드 값을 돌려줌
}