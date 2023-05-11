package Part2_코틀린중급문법살펴보기.ex_access_modifier_private

fun main() {
    // num = 5 // 에러
    hello(15)
    
    val person = Person(10)
    println(person.age)
    // person.age = 20 // 에러
    
    println(person.isYoung)
}