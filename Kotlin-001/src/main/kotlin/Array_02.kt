import java.util.*

fun main() {
    var scan = Scanner(System.`in`)
    var rnd = Random(System.currentTimeMillis())

    print("10 ~ 100까지의 정수를 입력하세요. >>")
    var input = scan.nextInt()
    var iArray = arrayListOf<Int>()
    var rndNum = 0
        for(num in 0 .. input) {
        rndNum = rnd.nextInt(100)+1
        iArray.add(rndNum)
    }

    println("old 배열 : $iArray")

    var nArray = iArray.map{ it +2 }

    println("new 배열 : $nArray")


}