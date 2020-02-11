fun main() {
    var a = Tiger();
    a.eat();
}
open class Animal{
    open fun eat(){ // 슈퍼 클래스에서 open이 붙은 함수는
                    // 재구현이 허용 되게 된다.
                    // override 을 붙이면 재구현이 된다.
        println("음식을 먹습니다.");
    }
}

class Tiger : Animal(){
    override fun eat(){
        println("고기를 먹습니다.");
    }

}
//오버 라이딩 됨
// 슈퍼 클래스에서 구현이 끝난걸 오버라이딩을 통해서
// 재구현
