package Chap04

object Data02 {
    var name: String = "";
    var type: String = "";
    var num: Int = 0;
    fun mypokeon() {
        println("$name , $type , $num ")
    }
}
// Object class
fun main() {
    val name = "kang";
    val type = "A";
    val num = 25;
    Data02.name = name;
    Data02.type = type;
    Data02.num = num;
    Data02.mypokeon();
}
/*
* 오브젝트 클래스
* 1. class가 아닌 object라는 키워드로 선언한다.
* 2. 생성자를 가질 수 없다.
* 3. 어느 클래스, 함수에서든 별도의 객체화 과정 없이 접근이 가능한다.
* 4. 프로그램이 실행되는 동안 저장된 데이터는 손실되지 않는다.
 */