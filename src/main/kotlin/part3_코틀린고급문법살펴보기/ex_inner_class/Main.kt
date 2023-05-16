package part3_코틀린고급문법살펴보기.ex_inner_class

/*
[내부 클래스]
 - 내부 클래스는 인스턴스가 바깥 클래스의 인스턴스에 완전히 소속되는 것
 
 - 내부 클래스를 선언할 때는 선언문 앞에 inner 키워드를 붙인다.
 
 - 내부 클래스의 인스턴스는 자신이 속해있는 바깥 클래스의 인스턴스를 가리키는 참조 변수를 내부적으로 가지고 있음
     ㄴ> 아래 예제 this@Outer가 해당
   내부 클래스는 this@Outer 키워드를 이용하여 자신이 속한 바깥 클래스의 인스턴스에 접근할 수 있음
   이런 특성 때문에 내부 클래스의 인스턴스는 반드시 '바깥 클래스의 인스턴스.생성자()' 꼴로 생성해야 함
* */

class Outer(private val value: Int) {
    fun print() {
        println(this.value)
    }

    // Inner 내부 클래스 선언
    inner class Inner(private val innerValue: Int) {
        fun print() {
            this@Outer.print() // Outer의 print
            println(this.innerValue + this@Outer.value)
        }
    }
}

fun main() {
    val instance: Outer = Outer(610)
    val innerInstance: Outer.Inner = instance.Inner(40)
    innerInstance.print()
}