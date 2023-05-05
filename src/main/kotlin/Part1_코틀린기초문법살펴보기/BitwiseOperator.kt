package Part1_코틀린기초문법살펴보기

fun main(args: Array<String>): Unit
{
    println(15 and 7)    // Java의 &
    println(5 or 2)      // Java의 |
    println(15 xor 5)    // Java의 ^
    println(32767.inv()) // Java의 ~32767
    println(1 shl 3)     // Java의 << 1을 왼쪽으로 3칸 시프트
    println(8 shr 1)     // Java의 >> 8을 오른쪽으로 1칸 시프트
    println(-17 ushr 2)  // Java의 >>> 부호를 유지한 채 -17을 오른쪽으로 시프트
}