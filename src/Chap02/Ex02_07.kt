package Chap02

fun main(){
    doWhen(1)
    doWhen("Hello")
    doWhen(12L)
    doWhen(3.14)
    doWhen("Kotlin")
}

fun doWhen(a: Any) { //최상위 자료형
    when(a){ //코틀린에서의 스위치문
        1 -> println("정수 1입니다.")
        "Hello" -> println("Hello K world")
        is Long -> println("Long타입입니다.")
        !is String ->println("No String")
        else -> println("다 아니다.") // switch에서 default와 같음
        
    }
    
}