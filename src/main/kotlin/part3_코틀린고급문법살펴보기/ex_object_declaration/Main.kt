package part3_코틀린고급문법살펴보기.ex_object_declaration

/*
[객체 선언]
 프로그램 전체에서 공유할 수 있는 하나뿐인 객체를 만들기
 object 키워드 덕에 자바에서 사용하던 싱글톤 패턴 코드를 사용하지 않아도 됨
* */

// 클래스를 선언하듯이 객체를 선언. 이렇게하면 Person이라는 식별자로 객체에 바로 접근 가능
object Person {
    var name: String = ""
    var age: Int = 0
    fun print(){
        println(name)
        println(age)
    }
}

fun main() {
    // 식별자 Person으로 객체에 바로 접근 가능
    Person.name = "Singleton"
    Person.age = 45
    Person.print()

    // Person은 타입 이름이기도 하기 때문에 아래와 같은 코드도 가능
    // 앞의 Person은 타입으로서의 Person, 뒤의 Person은 표현식으로서의 Person이다.
    val person: Person = Person
}