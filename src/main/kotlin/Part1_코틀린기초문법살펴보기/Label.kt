package Part1_코틀린기초문법살펴보기

/*
[레이블(Label)]
    break는 가장 가까운 반복문을 탈출하게 되는 데
    레이블을 사용해서 특정 반복문을 탈출할 수 있게 해준다.

    break 뒤에 @레이블명으로 지정 후 레이블명@특정반복문을 지정
*/

fun main(args: Array<String>): Unit {
    var x = 0
    var y = 0

    outer@ while(x <= 20) { 
        y = 0
        while(y <= 20) {
            if(x + y == 15 && x - y == 5) {
                break@outer // 11 라인에 있는 반복문을 탈출
            }
            y += 1
        }
        x += 1
    }

    println("x: $x, y: $y")

    var z = 0
    var k = 0

    test@ while(z <= 20) {
        k = 0
        while(k <= 20) {
            if(z + k == 15 && z - k == 5) {
                break@test
            }
            k += 1
        }
        z += 1
    }

    println("z : $z, k : $k")
}