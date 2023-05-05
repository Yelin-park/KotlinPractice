package Part2_코틀린중급문법살펴보기.ex_role_of_heap

/*
[힙 영역의 존재 이유]
    힙이라는 공간이 없었다면
    main 함수의 product 변수와 printProductInfo 함수의 product 매개변수가
    각각 자신만의 name과 price 변수를 가지고 있었을 것이다.
    이처럼 힙 영역을 두면 하나의 객체를 여러 참조 변수에서 공유하는 형태로 사용할 수 있어
    메모리 공간을 절약할 수 있다.
*/

/*
                    [스택 영역]       [힙 영역]
main함수             args
                    product
createProduct함수    apple     ----> name | "Apple"
                                    price | 1000

 createProduct 함수 호출이 끝나면 스택 영역에서 apple 참조 변수가 지워지고
 객체는 힙 영역에서 지워지지 않는다.
 힙 영역에 생성한 변수는 어느 블록에서 생성했던 간에 블록을 빠져나와도 지워지지 않는다.

 이후 product 변수에 apple이 가지고 있던 참조값이 저장되어 다음과 같은 상태가 된다.
                     [스택 영역]      [힙 영역]
main함수             args
                    product   -----> name | "Apple"
                                     price | 1000

 processProduct() 함수에도 product 참조 변수를 전달받아 힙 영역에 있는 객체를 가리키게 된다.
                      [스택 영역]      [힙 영역]
main함수               args
                      product   -----> name | "Apple"
                                       price | 1000
printProductInfo함수   product   -----> (같은 객체를 가리킴)

이런식으로 계속 같은 product를 가리키면서 영향을 받고 있음

*/
fun main(args: Array<String>): Unit {
    val product: Product
    product = createProduct()
    // val product: Product = createProduct() // 한 줄로 간결하게 코딩 가능하다
    printProductInfo(product)
    processProduct(product)
    printProductInfo(product)
}

fun createProduct(): Product {
    val apple = Product()
    apple.name = "Apple"
    apple.price = 1000

    return apple
}

fun processProduct(product: Product) {
    product.price += 500
}

fun printProductInfo(product: Product) {
    println("이름: ${product.name}")
    println("가격: ${product.price}")
}


