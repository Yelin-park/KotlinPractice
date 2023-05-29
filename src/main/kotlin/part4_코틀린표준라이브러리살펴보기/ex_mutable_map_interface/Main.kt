package part4_코틀린표준라이브러리살펴보기.ex_mutable_map_interface

/*
[MutableMap 인터페이스 살펴보기]
 - mutableMapOf 함수를 호출하면 MutableMap 타입의 객체가 반환된다.
   Mutable<K,V> 인터페이스는 Map<K, V>를 상속

 - MutableMap에서 추가 및 변경된 멤버는 다음과 같다.
   1) interface MutableEntry<K, V>: Map.Entry<K, V> {
        fun serValue(new Value: V): V
      }
      : MutableEntry는 키와 값 한 쌍을 표현하는 중첩 인터페이스.
        Map.Entry 인터페이스를 상속하며, 값을 변경할 수 있는 setValue 멤버 함수가 추가
        반환값은 이전에 갖고 있던 값(Value)이다.

   2) override val keys: MutableSet<K>
     : keys 프로퍼티는 MutableSet<K> 타입으로 오버라이딩 되었다.

   3) override val values: MutableCollection<V>
     : values 프로퍼티는 MutableCollection<V> 타입으로 오버라이딩

   4) override val entries: MutableSet<MutableMap.MutableEntry<K, V>>
     : entries 프로퍼티는 MutableSet<MutableMap.MutableEntry<K,V>> 타입으로 오버로딩
     
   5) abstract fun put(key: K, value: V): V?
     : put은 MutableMap에 키와 값 한 쌍을 추가하고 null을 반환
      만약, key와 동일한 키가 이미 존재하면, 그 키와 연관되어 있는 값을 value로 교체하기만 하고 이전에 갖고 있던 값을 반환
   
   6) abstract fun remove(key: K): V?
     : remove는 key 연관된 값을 삭제. 반환값은 삭제된 값.
       만약, key와 연관되어 있는 값이 없으면 null을 반환
   
   7) abstract fun remove(key: K, value: V): Booelan
     : key와 value를 인수로 받는 remove는 지정한 key와 value가 모두 일치하는 쌍을 삭제.
       key와 value가 모두 일차하는 쌍이 있으면 true, 아니면 false 반환

   8) abstract fun putAll(from: Map<out K, V>): Unit
     : putAll은 from에 있는 모든 키와 값 쌍을 추가한다. 만약 from의 키가 이미 존재하는 키이면,
       값만 from 값으로 변경

   9) abstract fun clear(): Unit
     : 모든 키와 값 쌍을 삭제

   10) inline operator fun <K, V> MutableMap<K, V>.set(key: K, value: V): Unit {
        put(key, value)
       }
       : set은 MutableMap을 map[key] = value 형태로 쓸 수 있게 해주며, 내용은 put 멤버 함수와 같다.
* */

fun main() {
    val map: MutableMap<String, String> = mutableMapOf()
    println(map) // {}

    println(map.put("Hi", "Nihao")) // null
    println(map) // {Hi=Nihao}
    
    println(map.put("Hi", "오하요")) // Nihao
    println(map) // {Hi=오하요}
    
    map["Hi"] = "안녕"
    println(map) // {Hi=안녕}

    map.putAll(mapOf("How is it going?" to "잘 지내?", "Bye!" to "잘 가!"))
    println(map) // {Hi=안녕, How is it going?=잘 지내?, Bye!=잘 가!}

    println(map.remove("Hi")) // 안녕
    println(map) // {How is it going?=잘 지내?, Bye!=잘 가!}

    println(map.remove("Bye!", "잘")) // false
    println(map) // {How is it going?=잘 지내?, Bye!=잘 가!}

    println(map.remove("Bye!", "잘 가!")) // true
    println(map) // {How is it going?=잘 지내?}

    map.clear()
    println(map) // {}
}