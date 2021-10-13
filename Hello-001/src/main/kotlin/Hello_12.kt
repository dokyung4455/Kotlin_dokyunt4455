import java.lang.NumberFormatException
import java.util.*

// 숫자를 다루는 코드에서 어떤 값이 0이 아닌 경우에만 처리하는 코드가 있고
// 0인 경우에도 처리해야하는 경우가 있다.
// 이때는 변수에 담긴 값이 null 인가를 검사하여
// 코드를 실행할지 말지를 결정해야 한다.
// 이때는 변수에 null 을 허용해야 한다.
fun main() {
    print("정수형 숫자 1을 입력하세요")
    var num1:String = scan1.nextLine()
    print("정수형 숫자 2를 입력하세요")
    var num2:String = scan1.nextLine()


    /**
     * 3항 연산 try
     * Integer.valueOf(num1) 실행이 정상적으로 종료되면
     * 연산 결과가 intNum1에 담기고
     * Exception 이 발생하면
     * println() 실행되어 메시지를 출력한 후 null 값이 intNum1 에 담기게 된다.
     */
    var intNum1:Int? = try {
        Integer.valueOf(num1);
    } catch (e:NumberFormatException) {
    null
    }
    var intNum2:Int? = try {
        Integer.parseInt(num2);
    } catch (e:NumberFormatException) {
        null
    }





    if(intNum1 != null && intNum2 != 0) {
        println("$num1 + $num2 = ${intNum1 + intNum2!!}")
        println("$num1 - $num2 = ${intNum1 - intNum2}")
        println("$num1 * $num2 = ${intNum1 * intNum2}")
        println("$num1 / $num2 = ${intNum1 / intNum2}")
    } else {
        println("정수형만 입력가능합니다.")
    }
}