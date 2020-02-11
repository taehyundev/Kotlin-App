package Chap04

fun main(){
    var d = Dog()
    d.eat()
    d.run()
}
 interface Runner{
    fun run() 
 }

interface Eater{
    fun eat(){
        println("음식을 먹습니다.")
    }
}

class Dog : Runner, Eater {
    // ,으로 구분
    override fun run() {
        println("우다다다 뜁니다.")
    }

    override fun eat() {
        println("허겁지겁 먹습니다.")
    }
}
//오버라이딩을 받은 하나의 서브 클래스가 됨
//혼선이 일어나지않게 오버라이딩하여 재구현 해주어야함