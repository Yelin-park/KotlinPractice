package part3_코틀린고급문법살펴보기.ex_data_class

/*
[데이터 클래스]
 - 클래스에는 크게 데이터 자체의 역할만 하는 클래스와 데이터를 다루는 역할을 하는 클래스가 있다.
    사원 데이터 자체만 속성으로 갖고 있는 Employee 클래스
    Employee의 인스턴스들을 관리하는 EmployeeManager 클래스

 - 코틀린은 데이터에 특화된 클래스를 선언할 수 있는 문법을 제공
   데이터 클래스를 선언하기 위해서는 클래스 선언문 앞에 data 키워드를 붙인다.
 
 - 데이터 클래스로 선언 시 이점
   > Any 클래스에 들어있는 equals, hashCode, toString 멤버 함수가 자동으로 오버라이딩 됨
   > equals 멤버 함수는 각 프로퍼티의 값이 서로 모두 같으면 true,
     하나라도 다르면 false를 반환하게 오버라이딩 됨
   > toString 멤버 함수는 "Employee(name=...,age=...,salary=...)"형태로 문자열을 반환하도록 오버라이딩 됨
   > 객체를 복사하는 copy 함수가 자동으로 선언됨(== 연산자를 오버로딩하는 함수)
     * copy와 똑같은 멤버 함수를 데이터 클래스에서 선언하면 충돌 오류 발생. (다른 멤버 함수는 선언해도 괜찮음)
     * copy 멤버 함수는 모든 매개변수가 디폴트 인수를 갖고 있기 때문에 원하는 프로퍼티만 다른 값으로 지정한 채 복사 가능
        ex) first.copy(name = "Park")

 - 데이터 클래스 선언하기 위한 규칙들
   > 적어도 하나의 프로퍼티를 가져야 한다.
   > 생성자 매개변수에는 반드시 var이나 val을 같이 써야한다.
     즉, 프로퍼티에 대응하지 않는 생성자 매개변수를 가질 수 없다.
   > abstract, open, sealed, inner 키워드를 붙일 수 없다.
   > 인터페이스만 구현할 수 있다. (코틀린 1.1 버전부터는 sealed 클래스도 상속 가능)
   > component1, component2 와 같은 이름으로 멤버 함수를 선언할 수 없음(컴파일러가 내부적으로 사용하는 이름)
* */

data class Employee(val name: String, val age: Int, val salary: Int)

fun main() {
    val first = Employee("John", 30, 30000)
    val second = Employee("Page", 24, 5300)
    val third = first.copy()

    println(first.toString())
    println(third.toString())
    println(first == second)
    println(first == third)
}
