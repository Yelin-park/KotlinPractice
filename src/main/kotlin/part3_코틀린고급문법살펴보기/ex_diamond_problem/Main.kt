package part3_코틀린고급문법살펴보기.ex_diamond_problem

/*
[다이아몬드 문제]
 - 상속 관계 그림이 다이아몬드를 닮아서 다이아몬드 문제라는 이름이 붙음

 - 아래 예제를 살펴보면 Child가 Mother과 Father 인터페이스를 모두 구현하고 있는데
   super.hello()를 하면 어떤 인터페이스의 follow가 호출될지 애매함
   코틀린은 이런 상황을 위해 원하는 인터페이스의 super를 호출할 수 있는 기능을 제공
   <> 호출할 super 멤버 함수를 지정
* */

interface Parent{
    fun follow(): Unit
}

interface Mother: Parent{
    override fun follow() = println("follow his mother")
}

interface Father: Parent{
    override fun follow() = println("follow his father")
}

class Child: Mother, Father {
    override fun follow() {
        println("A child decided to ")
        super<Mother>.follow()
    }
}

fun main() {
    Child().follow()
}