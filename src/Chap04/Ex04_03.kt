package Chap04

import com.sun.istack.internal.NotNull

class AAA (x: Int, y: Int){

    //var n :Int =x;
    var n :Int = 0
   // var n1 :Int =y;
   var n1 :Int = 0
    var a : Int =0;
    init{ // 제일 초기에 실행되는 것
        n = x;
        n1 = y;
    }
    constructor(x: Int) : this(x, x){
        this.n  =x;
        this.n1 = x;
    }
    fun printfun(){
        println("n : $n , n1 : $n1")
    }


}
//제일 기본적인 형태인 클래스이다.
//class 뒤에 constructor를 써서 기본 생성자를 만들어준다.
//constructor은 생략 가능하다.
//class AAA (x: Int, y: Int) 이 것과 동치하다
//constructor은 분리가 가능하다
fun main(){
    var s = AAA(2,3);
    s.printfun();
    var s1 = AAA(8);
    s1.printfun();
}
