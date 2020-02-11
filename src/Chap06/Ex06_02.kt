package Chap06

fun main(){
    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()
    println("${a.name} : ${a.count}")
    println("${b.name} : ${b.count}")
    println("총계 : ${FoodPoll.total}")

}
class FoodPoll(val name: String){
    companion object {
        var total = 0
    } //서로 다른 object임 에도 total은 공유를 하고 있으므로,
    //모든 인스턴스에서 투표수를 누적 가능했다.
    var count =0

    fun vote(){
        total++
        count++
    }

}