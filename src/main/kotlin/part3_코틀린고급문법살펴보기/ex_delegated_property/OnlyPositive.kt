package part3_코틀린고급문법살펴보기.ex_delegated_property

import kotlin.reflect.KProperty

/*
[위임된 프로퍼티]
 - 코틀린에서는 프로퍼티의 Getter/Setter 구현을 다른 객체에 맡길 수 있는 문법을 제공
   프로퍼티 선언문 뒤에 'by 객체'를 적으면 해당 객체가 프로퍼티의 Getter/Setter를 대리하게 된다.
* */

class OnlyPositive {
    private var realValue: Int = 0

    /*
    프로퍼티를 대리하는 객체는
    operator fun getValue(thisRef: Any?, property: KProperty<*>): T 와
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) 멤버 함수를 갖고 있어야 한다.
    여기서 T는 대리할 프로퍼티의 타입이다.
    */
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return realValue
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        realValue = if(value > 0 ) value else 0
    }
}
