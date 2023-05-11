package Part2_코틀린중급문법살펴보기.ex_extension_function

/*
[확장 함수]
 - String은 코틀린에 내장된 클래스이기 때문에 마음대로 멤버 함수 추가할 수 없음
   확장 함수라는 문법을 이용하면, 상속 없이 클래스 외부에서 멤버 함수를 추가할 수 있음
   
 - 확장 함수 선언하는 방법
    함수 이름 앞에 '함수를 주입할 클래스.'를 붙여주면 된다.
                    ㄴ> 리시버(Receiver) 타입
                    
 - this를 사용하면 리시버 타입의 프로퍼티나 멤버 함수에 접근할 수 있음
   단, private이거나 protected인 멤버에는 접근할 수 없음

 - 만약, 클래스에 이미 존재하는 멤버 함수와 동일한 시그니처의 확장 함수가 있다면
    오류는 나지 않지만, 확장 함수가 가려져 멤버 함수만 항상 호출한다.
 */

// 문자열이 숫자로만 이루어져있는지 판단하는 확장 함수
fun String.isNumber(): Boolean {
    var i = 0
    while(i < this.length) {
        // 숫자가 아닌 문자가 하나라도 들어있으면 false 반환
        if(!('0' <= this[i] && this[i] <= '9'))
            return false
        i += 1
    }
    // 모든 조건을 통과하면 true 반환
    return true
}

fun main() {
    println("1234567890".isNumber())
    println("500 원".isNumber())
}