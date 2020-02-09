package Chap03
//기존의 방식
fun main(){
    for(i in 1..10){
        if(i==3) continue; //3을 건너띈다
        println(i);
    }
    for(i in 1..10){
        if(i==3) break; //3일때 멈춘다
        println(i);
    }
}