package Chap05

fun main(){
    b(::a)
    val c: (String)->Unit = { str -> println("$str 람다함수")}
    //val c = { str:String -> println("$str 람다함수")} //축약
    b(c); // 람다는 그 자체가 고차이기 때문에 ::가 필요없음
}
//Ex05_01과 연계
// 람다 함수이며, val c 의 타입을 (String)->Unit으로 한다.
// str은 String으로 받아온 값을 람다함수 내에서 사용함 변수 이름이다.
// str은 str:String이 기본이지만 타입추론 기능으로 생략 가능하다.

// 난의도가 조금 높았다고 느껴서 조금 더 이 부분을
// 자주 사용하면 좋을꺼 같다.
