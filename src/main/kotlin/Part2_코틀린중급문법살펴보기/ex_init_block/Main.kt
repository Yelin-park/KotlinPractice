package Part2_코틀린중급문법살펴보기.ex_init_block

/*
[init 블록 나누어 쓰기]
    - 인스턴스가 생성되면, 위에서부터 순서대로 프로퍼티의 선언 및 초기화문과 init 블록이 실행된다.
    - 생성자의 매개변수는 init 블록뿐만 아니라 프로퍼티를 선언과 동시에 초기화하는 데에도 사용할 수 있다.
*/

class Size(width: Int, height: Int) {
    val width = width
    val height: Int

    init {
        this.height = height
    }

    val area: Int

    init {
        this.area = width * height
    }
}

fun main(args: Array<String>): Unit {
    val size = Size(10, 50)
    println(size.area)
}