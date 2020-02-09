package Chap03
import java.util.Scanner;
fun main(){
    val s:Scanner = Scanner(System.`in`)
    var n = s.nextInt();
    var n1 = s.nextInt();
    var sum =add(n,n1)
    print(sum);
}
fun add(a:Int,b:Int):Int{ // :로 반환형 체크
    return a+b;
}