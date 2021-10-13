import java.util.*

fun main() {
    var num1:Int = Random().nextInt(100)+1

    for(num in 0..num1) {
        print("$num,")
    }
    println()

    for(num in 2..(num1 -1)) {
        print("$num,")
    }
    println()

    /**
     *  0~ 99 까지 범위 중 임의로 생성되어 num1 에 저장된 숫자가
     *  prime 수 인지 판단하여 출력하시오
     */
    println("랜덤 숫자 : $num1")
    var bYes:Boolean = true;
    for(num in 2..(num1 -1)) {
        if(num1 % num == 0 ) {
            bYes = false
        }
    }
    if(bYes == false) {
        println("$num1 은 소수가 아님")
    } else {
        println("$num1 은 소수")
    }
        
    println()


}