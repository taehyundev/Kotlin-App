package Chap05

fun main(){
    b(::a) //a를 파라미터로 넘겨줌
    //고차함수 형태는 ::를 파라미터값 앞에 붙이면 됨
}

fun a(str: String){
    println("$str 함수 a")
}
fun b(function: (String) ->Unit){
    function("b가 호출한")

}

// 위와 같은 형태가 고차 함수이다.
// function : (타입) -> Unit

