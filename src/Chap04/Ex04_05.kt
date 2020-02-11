package Chap04

fun main(){
    var r = Rabbit();
    r.eat();
    r.sniff();
}
abstract  class Animal {
    abstract fun eat()
    fun sniff(){
        println("킁킁");
    }
}

class Rabbit : Animal(){
    override  fun eat(){//구현 되지않은 추상화 클래스에 추상화 함수를 오버라이딩한다.

        println("당근을 먹습니다.");
    }

}
//추상함수는 생성자 가질 수 있음
// 인터페이스는 없음
// Interface에서 구현부가 있는 함수를 open함수 구현부가 없는 함수를 abstract 함수로 간주