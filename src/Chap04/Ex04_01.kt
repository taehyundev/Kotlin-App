package Chap04

data class Data01(
    val name : String,
    val type : String,
    var num : Int,
    var own : Boolean
)
//Data class
fun main() {
    val Data01 = Data01("kang","A",23,true)

    if (Data01.own){
        print("${Data01.name} is True");
    }else{
        print("${Data01.name} is false");
    }
}

/*
* 데이터 클래스의 특징
*
* 1. class 앞에 data 키워드를 사용함으로써 선언
* 2. 중괄호로 열고 닫는 것이 아닌 소괄호를 사용
* 3. 변수나 상수만 선언할 수 있다. 구분은 쉼표(,)로 한다.
* 4. properties 를 일반 클래스와 달리 초기화 해주지 않아도 된다.
* 5. 생성과 동시에 클래스 내의 프로퍼티를 기준으로 생성자가 만들어진다.
* */