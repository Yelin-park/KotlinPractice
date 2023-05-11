package Part2_코틀린중급문법살펴보기.ex_access_modifier_private

/*
[접근 지정자: private]
* */

private var num = 10 // Test.kt 파일 내에서만 접근 가능

private fun print() = println(num) // Test.kt 파일 내에서만 접근 가능

public fun hello(value: Int) { // 어디에서나 접근 가능
    num = value
    print()
}

public class Person(age: Int) { // 어디에서나 접근 가능
    // 디폴트 Setter를 private로 지정. Setter는 Person 클래스 내부에서만 접근 가능
    public var age = age
        private set
    
    // Getter를 public으로 지정. 어디에서나 접근 가능
    public val isYoung public get() = age < 30
}