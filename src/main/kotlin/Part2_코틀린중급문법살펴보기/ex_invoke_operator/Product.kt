package Part2_코틀린중급문법살펴보기.ex_invoke_operator

/*
[호출 연산자 ()]
    () 연산자를 오버로딩하는 멤버 함수 invoke 선언
* */

class Product(val id: Int, val name: String) {
    operator fun invoke(value: Int) {
        println(value)
        println("id: $id\nname: $name")
    }
}