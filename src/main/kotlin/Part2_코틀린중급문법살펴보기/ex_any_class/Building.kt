package Part2_코틀린중급문법살펴보기.ex_any_class

/*
[Any 클래스]
    - 어떤 클래스가 아무 클래스도 상속하지 않으면 자동으로 Any라는 클래스를 상속
      다른 클래스를 상속한다고 해도, 그 클래스 또한 Any 클래스를 자동으로 상속하므로
      간접적으로 Any 클래스를 상속하게 된다.
      즉, 모든 코틀린 클래스들은 Any 클래스를 상속한다는 것이 보장된다.
* */

/*
Any 클래스에는 세 가지 멤버 함수가 있다.
모든 클래스는 Any 클래스를 상속하므로, 코틀린의 모든 클래스는 반드시 아래 3가지 멤버 함수를 갖는다.
open class Any{
    // == 연산자를 오버로딩하는 멤버 함수
    open operator fun equals(other: Any?): Boolean
    
    // 객체 고유의 해시코드를 반환하는 멤버 함수
    open fun hashCode(): Int
    
    // 객체의 내용을 String 타입으로 변환하는 멤버 함수
    open fun toString(): String
}
*/

class Building(val name: String = "", // 건물명
                val date: String = "", // 건축일자
                val area: Int = 0 // 면적(m²)
) {
    override fun toString(): String =
        "이름: ${this.name}\n" +
        "건축일자: ${this.date}\n" +
        "면적: ${this.area} m²"
}
