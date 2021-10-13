fun main() {
 
    // num 이라는 변수를 만들고 0~9까지 출력하라
    for(num in 0..9) {
        print("$num, ")
    }

    var sum = 0
    for(num in 1..10) {
        sum += num
    }
    println("1~ 10까지 덧셈 : $sum")

    // 0 ~ < 10
    for(num in 0 until 10) {
        print(num)
    }

    // for(int i = 10 ; >= 0 ; i--) {}
    for(num in 10 downTo 11) {
        print(num)
    }

    println()
    for(num in 0..10 step 2) {
        if(num % 2 == 0){
        print("$num,")
        }
    }

}