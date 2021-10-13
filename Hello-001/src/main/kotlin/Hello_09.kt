import java.lang.NumberFormatException

fun main() {

var bYes:Boolean = true
while (true) {
    print("첫번째 숫자를 입력하시오.")
    var num1: String = scan1.nextLine()
    print("두번째 숫자를 입력하시오.")
    var num2: String = scan1.nextLine();
    var intNum1 = 0;
    var intNum2 = 0;
    try {
        intNum1 = Integer.valueOf(num1)
        intNum2 = Integer.parseInt(num2)
    } catch (e: NumberFormatException) {
        println("정수형 숫자로 입력해주세요.")
    bYes = false
    }
    if(bYes) {
        println("첫번째 $intNum1, 두번째 $intNum2")
        break
    }


}
println("성공!")
}