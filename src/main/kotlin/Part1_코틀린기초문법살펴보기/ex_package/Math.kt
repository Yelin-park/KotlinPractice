package Part1_코틀린기초문법살펴보기.ex_package

/*
[소스 파일 여러 개로 분리하기]
*/

// a와 b 중 더 큰 수를 반환하는 함수
fun max(a: Int, b: Int): Int = if(a > b) a else b

// a와 b 중 더 작은 수를 반환하는 함수
fun min(a: Int, b: Int): Int = if(a < b) a else b

// num의 절대값을 반환하는 함수
fun abs(num: Int): Int = if(num >= 0) num else -num
