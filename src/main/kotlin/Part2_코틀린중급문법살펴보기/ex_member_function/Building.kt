package Part2_코틀린중급문법살펴보기.ex_member_function

/*
[멤버 함수]
    클래스에 내장된 함수를 멤버 함수라고 한다.
 */

class Building {
    var name = "" // 건물명
    var date = "" // 건축일자
    var area = 0 // 면적(m²)

    /* 아래와 같이 클래스에 내장된 함수를 멤버 함수라고 부른다.
       각 프로퍼티 이름 앞에 this. 붙어있다.
       this는 멤버 함수가 호출될 때, 어떤 객체로부터 호출된 것인지를 나타내는 키워드이다.
       즉, building.print()와 같이 멤버 함수를 호출하면 this 키워드는 building 참조 변수가 가리키는 객체로 치환된다.
       this.는 생략 가능하므로, println("이름: " + name)과 같이 프로퍼티 이름만 써도 상관 없다. */
    fun print() {
        println("이름: " + this.name)
        println("건축일자: " + this.date)
        println("면적: ${this.area}m²")
    }
}

// printBuilding 함수는 Building의 인스턴스만을 위한 함수
// 이렇게 특정 클래스와 강한 연관이 있는 함수는 아예 클래스 안으로 내장시킬 수 있다(print)
fun printBuilding(buildng: Building) {
    println("이름: " + buildng.name)
    println("건축일자: " + buildng.date)
    println("면적: " + buildng.area)
}