package Part1_코틀린기초문법살펴보기
/*
[정수타입과 실수타입]
정수타입
    Byte : 1byte(-128~127)
    Short : 2byte(-3만 2768 ~ 3만 2767)
    Int : 4byte(-21억 4784만 3648 ~ 21억 4784만 3647)
    Long : 8byte(-922경 3372조 0368억 5477만 5808 ~ 922경 3372조 0368억 5477만 5807)

실수타입(소수점 정밀도 차이)
    Float : 4byte
    Double : 8byte
*/
fun main(args: Array<String>): Unit
{
    val a: Byte = 125
    val b: Short = (100 + 200) * 100
    // 숫자 리터럴 안에 언더스코어를 넣어 숫자를 좀 더 알아보기 쉽게 표현 가능(위치, 개수는 마음대로)
    var c: Int = 12_4354_6538
    println(a) // 125
    println(b) // 30000
    println(c) // 1243546538

    // 정수 리터럴이 0x로 시작하면 16진수 인식
    // 정수 리터럴이 0b로 시작하면 2진수로 인식
    c = 0xFF_88_88
    println(c) // 16746632
    
    c = 0b01010010_01100011_01110101_01000101
    println(c) // 1382249797
    
    // 정수 리터럴의 값이 Int의 범위를 초과하면 자동으로 Long 타입이 됨
    var d: Long = -543_7847_3984_7238_4723
    println(d) // 5437847398472384723

    // Int보다 작은 범위의 타입의 연산의 결과는 무조건 Int 타입으로 나옴
    c = a + b // Byte + Short
    d = c + 10L // Int + Long -> Long 타입의 결과
    println(c) // 30125
    println(d) // 30135

    var e: Float = 67.6f
    val f: Double = 658.456
    // 67.6f + 658.456 계산을 하면 726.056이 됨
    // 726.056은 Double 타입으로 Float 타입인 변수 e에 저정할 수 없으므로 Float 타입으로 변환
    e = (e + f).toFloat()
    println(e) // 726.05597

}