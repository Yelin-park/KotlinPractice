package Part2_코틀린중급문법살펴보기.ex_indexed_access_operator

/*
[번호 붙은 접근 연산자 [] ]
* */

fun main() {
    val person = Person("Kotlin", "2016-02-15")
    println(person[0])
    println(person[1])
    println(person[-1])

    person[0] = "Java"
    println(person.name)
}