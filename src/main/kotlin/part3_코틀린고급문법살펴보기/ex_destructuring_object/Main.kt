package part3_코틀린고급문법살펴보기.ex_destructuring_object

/*
[객체 분해하기]
 - 데이터 클래스의 인스턴스에 한해, 객체를 여러 개의 변수로 쪼개는 것이 가능
* */

data class Employee(val name: String, val age: Int, val salary: Int)

fun main() {
    // 사용하지 않는 변수의 이름은 언더스코어(_)를 지정하여 무시할 수 있음
    val(name, _, salary) = Employee("John", 30, 3300)
    println(name);println(salary)
}