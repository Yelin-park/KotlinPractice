package Part1

// 코틀린은 자바보다 더 타입 체크에 엄격함 Double 타입의 변수에 Int 타입의 값을 저장할 수 없음
fun main(args:Array<String>): Unit
{
    val num: Int = 15 - 4 * 3
    val num2: Int = 65 % 7 // 니머지
    // Double은 실수 값을 저장할 수 있는 타입
    val num3: Double = 7.5 / 5 + 22.25 // Double / Int의 결과값은 Double
    val num4: Double = num / num2 + 0.7

    println(num)
    println(num2)
    println(num3)
    println(num4)

    val dNum: Double = 15.0 - 4 * 3
    // Int 타입의 표현식 뒤에 .toDouble()을 붙이면 해당 표현식의 타입이 Double 타입으로 포장됨
    val dNum4: Double = dNum.toDouble() / num2 + 0.7
    println(dNum)
    println(dNum4)
}