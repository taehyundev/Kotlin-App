package Chap02

fun main(){
    var intArr = arrayOf(1,2,3,4,5)
    // 1,2,3,4,5라는 값을 담는 5칸짜리 배열을 만들었다.
    // arrayOf라는 함수를 사용했다.
    var nullArr = arrayOfNulls<Int>(5) // 빈배열 5칸을 만듦
    //만들기 위해서는 arrayofNulls 함수에 <> 제네릭을 통해 자료형을 지정한후
    // ()안에 size를 지정하는 형태로 만들수 있다

    nullArr[3]= 4;
    print(nullArr[3]);
}