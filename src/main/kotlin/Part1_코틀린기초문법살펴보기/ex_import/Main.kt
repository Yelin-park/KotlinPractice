package Part1_코틀린기초문법살펴보기.ex_import

import Part1_코틀린기초문법살펴보기.ex_package.max
import Part1_코틀린기초문법살펴보기.ex_package.min as ex_min

/*
[import]
    import 키워드를 사용하면 다른 패키지에 선언된 함수를 패키지 이름 없이 호출할 수 있다
    import 패키지이름.*과 같이 적으면 그 패키지에 들어있는 모든 함수를 패키지 이름 없이 호출 가능
    import 패키지이름.함수이름 as 새로운 이름과 같이 적으면 새로운 이름으로 해당 함수를 호출 가능
*/

fun main(args: Array<String>): Unit {
    println(max(55, 47))
    // import Part1.ex_package.min as ex_min으로 설정하여 해당 이름으로 함수 호출
    println(ex_min(3, 10))
}