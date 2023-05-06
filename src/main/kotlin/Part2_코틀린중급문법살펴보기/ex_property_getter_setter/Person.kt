package Part2_코틀린중급문법살펴보기.ex_property_getter_setter

/*
[프로퍼티와 Getter/Setter]
    - 프로퍼티는 실제로 데이터가 저장되는 공간(Field),
      저장된 값을 읽으려고 할 때 호출되는 함수(Getter),
      값을 저장하려고 할 때 호출되는 함수(Setter)로 이루어져 있다.
      
    - val 프로퍼티는 초기 값이 주어지면 더 이상 값을 변경(Set)할 수 없다.
      그래서 val 프로퍼티에는 Getter만 존재

    - Getter/Setter을 별도로 정의하지 않으면 다음과 같이 자동으로 정의된다.
        class Person {
            var age: Int = 0
            get() {
                return field
            }
            set(value) {
                field = value
            }
        }

    - 프로퍼티에 디폴트 Getter/Setter가 포함되어 있기 때문에 자바처럼 Getter/Setter를 만들 필요 X
      단, Getter/Setter 동작을 커스텀 마이징 하고 싶다면 별도로 정의가 필요하다.

    - 프로퍼티의 Getter/Setter는 다양한 형태로 정의가 가능하다.
       > 디폴트 Getter/Setter 정의(해당 코드가 필요한 이유는 접근 지정자 예제에서 다룸)
        var age = 0
         get
         set

       > Getter 속 문장이 하나일 때 축약 가능
         var name = ""
         get() = "이름: $field"

    - val 프로퍼티이고, Getter의 반환 값이 field가 아니라면 다음처럼 프로퍼티의 타입을 생략할 수 있다.
      Getter의 반환 타입으로 프로퍼티의 타입을 추론할 수 있기 때문이다.
      class Person {
        var age = 0
        val isYoung get() = age < 30
      }
* */

class Person {
    var age: Int = 0
        get() {
            return field
        }

        set(value) {
            // field는 실제로 값이 저장되는 프로퍼티 속의 변수를 나타내는 특수 식별자
            field = if(value >= 0) value else 0
        }
}