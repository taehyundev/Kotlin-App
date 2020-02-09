package Chap03

fun main(){
    loop@for (i in 1..10){
        for(j in 1..10){
            if(i==1 &&j==2) break@loop
            println("i: $i, j: $j") //$를 붙이면 변수명을 따옴표안에 넣을 수 있다.
        }
    }
}
//원래는 2중 for문에서 저러한 형태로 나오려고하면 모든 for문에 조건식을 달았어야했다.
//하지만 제일 큰 for문에 loop@를 달고 break지점에 break@loop를 하게되면
//모든 for문이 조건식에 맞게 종료되는 것을 볼 수있다.