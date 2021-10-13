import java.util.*

// 전역변수 public으로 선언된 변수는 프로젝트 내의 전체에서 사용되기 때문에 변수명이 겹치면 오류가 발생한다.
var scan1:Scanner = Scanner(System.`in`)
fun main() {
    print("정수형 숫자 1을 입력하세요")
    var num1:String = scan1.nextLine()
    print("정수형 숫자 2를 입력하세요")
    var num2:String = scan1.nextLine()

    var intNum1 = Integer.valueOf(num1);
    var intNum2 = Integer.parseInt(num2);

    println("$num1 + $num2 = ${intNum1 + intNum2}")
    println("$num1 - $num2 = ${intNum1 - intNum2}")
    println("$num1 * $num2 = ${intNum1 * intNum2}")
    println("$num1 / $num2 = ${intNum1 / intNum2}")

}