package Chap06

//이벤트가 일어날 것을 감지하는 observer 즉 "옵저버"가 있다.
//함수로 직접 요청 x , 시스템 루틴에 의해 발생하는 동작을 이벤트라고한다.
//이벤트가 발생할 때마다 즉각 처리하게 만드는 프로그램 패턴을 옵저버 패턴이라고 한다.

//이벤트 수신 클래스
//이벤트의 발생 및 전달 클래스

fun main(){
EventPrinter().start()
}

interface EventListener{
    fun onnEvent(count: Int)
}
class Counter2(var listener: EventListener){

    fun count() {
        for(i in 1..100){
            if(i % 5 == 0) listener.onnEvent(i)
        }
    }
}
/*
class EventPrinter: EventListener{
    override fun onnEvent(count: Int) {
        print("${count}-")
    }
    fun start(){
        val counter = Counter2(this)
        counter.count()
    }
}

 */

class EventPrinter{
    fun start(){
        val counter = Counter2(object : EventListener{
            override fun onnEvent(count: Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}
//익명 객체라고 함 바로 위의 클래스 안의 형태를
//5의 배수마다 이벤트 발생