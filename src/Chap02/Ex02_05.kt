package Chap02
import java.util.Scanner;
fun main() {
    val s: Scanner = Scanner(System.`in`) //예약어라서 ``로 감싸야함
    print("최대값을 적으시오")
    var n = s.nextInt();
    for (i in 1..n) {
        for (j in 1..i)
            print("*")
        print("\n");
    }

}