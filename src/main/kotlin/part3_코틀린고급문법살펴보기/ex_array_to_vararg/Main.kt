package part3_코틀린고급문법살펴보기.ex_array_to_vararg

/*
[배열을 가변 인수로 활용하기]
 - 배열 속에 들어있는 원소들은 가변 인수로 활용할 수 있다.
* */

fun printAll(vararg tokens: String) {
    for (token in tokens)
        print("$token ")
}

fun main() {
    val numbers: Array<String> = arrayOf("What's", "your", "name?")
    printAll(*numbers) // 배열 앞에 *을 찍으면 배열 속의 내용을 가변 인수로 활용할 수 있음
}