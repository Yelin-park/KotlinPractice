package part3_코틀린고급문법살펴보기.ex_abstract_class

/*
[추상 클래스]
 - 클래스를 추상클래스로 만드려면 클래스 선언 맨 앞에 abstract 키워드 붙이기
 
 - 여러 클래스를 한 타입으로 묶어주고, 공통되는 멤버를 전파하는 용도로 쓰는 클래스는 추상 클래스로 선언하는 것이 좋다.

 - abstract 키워드는 그 자체로 open을 포함하고 있기 때문에 open 키워드를 따로 적지 않아도 됨
 
 - 추상 클래스는 추상 멤버 함수를 가질 수 있다.
   추상 멤버 함수란? 내용이 없는 멤버 함수. 멤버 함수 맨 앞에 abstract 키워드를 붙이면 된다.
   
 - 추상 클래스는 추상 프로퍼티도 가질 수 있다. 프로퍼티 선언문 맨 앞에 abstract 키워드를 붙이면 된다.

 - 추상 클래스를 상속하는 서브클래스에도 abstract를 붙이면 추상 멤버 함수를 반드시 오버라이딩 하지 않아도 된다.
   단, 이 클래스를 다시 일반 클래스로 상속할 때는 오버라이딩을 반드시 해야 한다.
* */

// 단순히 학생, 교수, 직원 클래스를 하나의 타입으로 묶어주는 클래스 - 추상클래스
abstract class Person {
    abstract fun getSalary(): Int
}

// 학생클래스. tuition은 한 학기 등록금
class Student(private val tuition: Int): Person() {
    // 학생은 등록금을 납부하므로 salary를 음수 처리
    override fun getSalary() = -tuition
}

// 교수 클래스. classCount는 진행하는 수업의 수
class Professor(private val classCount: Int): Person() {
    override fun getSalary() = classCount * 200
}

// 학교 직원 클래스. initial은 초봉(반기), years는 경력(년)
class Employee(private val initial: Int, private val year: Int): Person() {
    override fun getSalary() = initial * (1.0 + year / 10.0).toInt()
}

// 구성원으로부터 학교의 재정을 구한다.
fun getFinance(vararg persons:Person): Int {
    var i = 0
    var finance = 0
    while(i < persons.size) {
        finance -= persons[i].getSalary()
        i += 1
    }
    return finance
}

fun main() {
    // Student, Professor, Employee 타입이 상속 관계에 의해 Person 타입으로 묶여있으므로 해당 변수를 여러개 받을 수 있다.
    val finance = getFinance(Student(330), Student(330), Professor(1), Professor(2), Employee(1300, 2))
    println("학교 재정: $finance 만원")
}