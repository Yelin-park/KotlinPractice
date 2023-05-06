package Part2_코틀린중급문법살펴보기.ex_indexed_access_operator

/*
[번호 붙은 접근 연산자 [] ]
    - [] 연산자는 표현식[표현식] 형태로 적으며, 객체의 일부 값을 추출해낼 때 사용한다.
    - [] 연산자에는 여러 개의 피연산자를 지정할 수 있다.
        person[1, 2, 3,] ==> person.get(1, 2, 3)이 호출
        person[1, 2] = "J" ==> person.set(1, 2, "J) 호출
* */

class Person(var name: String, var birthday: String) {
    // [] 연산자를 오버로딩하는 멤버 함수 get 선언 - position에 해당하는 위치의 프로퍼티 값을 반환
    // person[0]은 컴파일 시 person.get(0)으로 번역
    operator fun get(position: Int): String {
        return when(position) {
            0 -> name
            1 -> birthday
            else -> "알 수 없음"
        }
    }

    // [] 연산자를 오버로딩하는  멤버 함수 set 선언 - position에 해당하는 위치의 프로퍼티 값을 value로 변경
    // person[0] = "Java"는 컴파일 시 person.set(0, "Java")로 번역
    operator fun set(position: Int, value: String) {
        when (position) {
            0 -> name = value
            1 -> birthday = value
        }
    }
}