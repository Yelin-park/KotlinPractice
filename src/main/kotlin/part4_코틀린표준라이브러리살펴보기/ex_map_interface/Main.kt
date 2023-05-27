package part4_코틀린표준라이브러리살펴보기.ex_map_interface

/*
[Map 인터페이스 살펴보기]
 - Map 인터페이스는 다음과 같이 선언
    interface Map<K, out V>

 - Map 인터페이스는 아래와 같은 멤버를 갖는다.
  1) interface Entry<out K, out V>
   : Entry는 키와 값 한 쌍을 표현하는 중첩 인터페이스이다.

  2) abstract val size: Int
   : size는 Map에 들어있는 키와 값 쌍의 개수를 갖는 프로퍼티이다.
  
  3) abstract val keys: Set<K>
   : keys는 Map의 키들만 갖는 프로퍼티. Map의 키는 중복되지 않기 때문에 Set 타입으로 되어있음
  
  4) abstract val values: Collection<V>
   : values는 Map의 값들만 갖는 프로퍼티. Map의 값은 중복될 수 있기 때문에 Collection 타입으로 되어있음
   
  5) abstract val entries: Set<Map.Entry<K, V>>
   : entries는 Map에 들어있는 모든 키와 값 쌍들을 갖는 프로퍼티.
  
  6) abstract fun isEmpty(): Boolean
   : isEmpty 멤버 함수는 Map이 비어있는지 여부를 반환

  7) abstract fun containsKey(key: K): Boolean
   : containsKey 멤버 함수는 Map에 key에 해당하는 키가 들어있는 여부를 반환
  
  8) abstract fun containsValue(value: V): Boolean
   : containsValue 멤버 함수는 Map에 value에 해당하는 값이 들어있는 여부를 반환
  
  9) abstract operator fun get(key: K): V?
   : get은 key에 해당하는 값을 반환하는 연산자 멤버 함수. 만약 key에 해당하는 값이 없으면 null 반환.
     get은 Map 타입에 []연산자를 사용할 수 있도록 하는 역할도 함
  
  10) open fun getOrDefault(key: K, defaultValue: V): V
   : getOrDefault 멤버 함수는 key에 해당하는 값을 반환하되, key에 해당하는 값이 없으면 defaultValue를 대신 반환
* */

fun main() {
    val map: Map<String, String> = mapOf("Apple" to "사과", "Banana" to "바나나")
    
    println(map.size) // 2
    println(map.keys) // [Apple, Banana]
    println(map.values) // [사과, 바나나]
    println(map.entries) // [Apple=사과, Banana=바나나]
    println(map.isEmpty()) // false
    println(map.containsKey("Grape")) // false
    println(map.containsValue("바나나")) // true
    println(map["Apple"]) // 사과
    println(map.getOrDefault("Grape", "포도")) // 포도
}