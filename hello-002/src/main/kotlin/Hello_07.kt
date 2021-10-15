import java.util.*

fun main() {
    var scan:Scanner = Scanner(System.`in`)

    /**
     * 키보드에서 정수값을 입력받아 입력한 정수가 3의 배수인지를 판별하는 코드를 작성하세요
     */
    var intNum = 0
        try {
            intNum = scan.nextInt()
    } catch (e:Exception) {
        print("정수만 입력하세요")
        return
    }
    if(intNum % 3 == 0) {
        println("$intNum 은 3의 배수입니다.")
    } else {
        println("$intNum 은 3의 배수가 아닙니다.")
    }
}