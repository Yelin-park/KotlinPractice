package Part2_코틀린중급문법살펴보기.ex_object_extends_class

/*
[클래스를 상속하는 객체]
    - 클래스 없이 객체를 만들 때 쓰는 object 표현식으로도 상속을 할 수 있다.

    - 클래스를 상속하는 객체 문법
        object: 슈퍼클래스 이름(생성자 인수)
* */

open class Person(val name: String, val age: Int) {
    open fun print() {
        println("이름: $name")
        println("나이: $age")
    }
}

fun main() {
    /* Person 클래스를 상속하는 object 표현식
     객체를 만들면서 어떤 클래스를 상속하려면 클래스간에 상속하듯이 obejct: 슈퍼클래스 이름(생성자 인수)를 붙여주면된다.
    클래스 없이 객체를 만들면서 상속을 했으므로 이때의 상속은 1회용이 된다. */
    val custom: Person = object : Person("Ellie", 29) {
        override fun print() {
            println("It's a object")
        }
    }

    custom.print()
}