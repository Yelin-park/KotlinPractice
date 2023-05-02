package Part1

/*
[디폴트 인수]
    디폴트 인수는 매개변수에 기본 값을 지정하는 방법이다.
    인수를 생략할 때는 맨 오른쪽에서 하나씩 생략해야 된다.
    인수를 전달할 매개변수의 이름을 직접 지정하면 중간에 있는 인수도 생략할 수 있다.
    
    주의! 매개변수의 이름을 지정한 인수는 일반 인수들보다 항상 오른쪽에 있어야 한다.
*/

fun main(args: Array<String>): Unit {
    println(getAverage(89, 96))
    getAverage(100, 50, true)
    println(getAverage(90))
    getAverage(66, print = true)
    getAverage(print = true)
    getAverage(print = true, a = 10, b = 30)

}

fun getAverage(a: Int = 0,  b: Int = 0, print: Boolean = false): Double {
    val result = (a + b) / 2.0
    if(print) {
        println("t" + result)
    }
    return result
}