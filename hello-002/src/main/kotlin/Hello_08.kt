import java.lang.NumberFormatException
import java.util.*

fun main() {
    var scan:Scanner = Scanner(System.`in`)

    while(true) {
        print("정수값을 입력하세요(Exit : 0) >>")
        var strNum = scan.nextLine();
        if(strNum.equals("0")){
            println("종료")
            break
        }
        var intNum = try {
            Integer.valueOf(strNum)
        } catch (e:NumberFormatException) {
            println("정수만 입력 할 수 있습니다.")
            println("처음으로 돌아갑니다.")
            continue
        }
        if(intNum % 3 == 0) {
            println("$intNum 은 3의 배수")
        } else {
            println("$intNum 은 3의 배수가 아닙니다.")
        }

    }
}