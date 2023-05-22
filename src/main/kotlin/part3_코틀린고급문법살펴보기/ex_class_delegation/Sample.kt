package part3_코틀린고급문법살펴보기.ex_class_delegation

/*
[클래스 위임]
* */

// 인터페이스를 구현하면서 뒤에 by 객체를 지정하면 인터페이스의 구현을 해당 객체로 위임한다.
// 이 때 객체는 대리할 인터페이스를 구현하고 있어야 한다.
class Sample: Plusable by ClassDelegator()