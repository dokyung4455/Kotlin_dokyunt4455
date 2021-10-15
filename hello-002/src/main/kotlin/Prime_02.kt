import java.util.*
import kotlin.random.Random

var rnd:Random = Random(System.currentTimeMillis())

fun main() {
    var scan:Scanner = Scanner(System.`in`)
    while(true) {
        prime()

        println("계속할까요? (EXIT : 0)")
        var input:String = scan.nextLine()
        if(input.equals("0")) {
            break
        }
    }
}
fun prime() {
    var num1:Int = rnd.nextInt(100)

    println("생성된 난수 : $num1")

    // range 데이터(일종의 유사배열)
    var resultArray = (2 until num1).filter { num1 % it == 0 }
    println(resultArray)

    if(resultArray.isEmpty()) {
        println("$num1 는 소수")
    } else {
        println("$num1 는 소수가 아님")
    }
}