import java.util.*

// public 변수로 scan을 선언했다.
// type java.util.Scanner class
// 클래스를 가져와서 객체로 선언 및 생성하기
// 생성자를 new 키워 없이 그냥 호ㅜㄹ하여 객체를 초기화 한다.
val scan:Scanner = Scanner(System.`in`)

fun main() {
    println("문자열을 입력")
    var input:String = scan.nextLine()

    println("입력한 문자열 : $input")

    /**
     * 키보드를 사용하여 2개의 문자열형 숫자를 입력 받고
     * 두 숫자의 4칙 연산을 수행하여 console에 표시하시오
     */

    var num1:Int = scan.nextInt()
    var num2:Int = scan.nextInt()

    println("$num1 과 $num2 의 합은? : ${num1 + num2}")
    println("$num1 과 $num2 의 뺄셈은? : ${num1 - num2}")
    println("$num1 과 $num2 의 곱셈은? : ${num1 * num2}")
    println("$num1 과 $num2 의 나눗은? : ${num1 / num2}")


}