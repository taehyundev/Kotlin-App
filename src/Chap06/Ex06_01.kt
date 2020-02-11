package Chap06

fun main(){
    println(Counter.count)

    Counter.countUp()
    Counter.countUp()
    println(Counter.count)

    Counter.clear()
    println(Counter.count)

}

object Counter {
    var count =0
    fun countUp(){
        count ++
    }
    fun clear(){
        count =0
    }
}
//인스턴스를 생성하지 않고, 그 자체로 객체임
