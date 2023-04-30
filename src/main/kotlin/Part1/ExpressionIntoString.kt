package Part1
/*
[문자열 안에 표현식의 값을 집어넣기]
    $ 뒤에 변수 이름을 적으면 해당 부분은 변수의 값으로 대체 됨
    $자체를 사용하고 싶으면 \$로 사용
    변수의 값이 아닌 표현식의 값을 문자열에 포함하고 싶으면 ${표현식}을 사용
 */
fun main(args: Array<String>): Unit
{
    val a = 10
    val b = 20

    // 이렇게 작성해도 컴파일되면 a의 값 + a로 변환됨.
    // 사람이 읽고 쓰기 좋게 추가적으로 제공하는 문법을 문법적 설탕이라고 부름
    println("a의 값: $a") 
    println("b의 값: $b")

    println("a + b = ${a+b}")
}