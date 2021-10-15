import java.util.*

fun main() {
    var rnd:Random = Random(System.currentTimeMillis())
    var num1 = rnd.nextInt(100)

    println("생성된 난수 : $num1")
    
    if(num1 % 2 == 0) {
        println("생성된 난수는 짝수이다")
    } else {
        println("생성된 난수는 짝수가 아니다")
    }
    
    if(num1 % 3 == 0) {
        println("생성된 난수는 3의 배수이다")
    } else {
        println("생성된 난수는 3의 배수가 아니다")
    }
    var result:String = if(num1 % 2 == 0) "짝수" else "홀수"
    println("$num1 은 $result 이다")
}