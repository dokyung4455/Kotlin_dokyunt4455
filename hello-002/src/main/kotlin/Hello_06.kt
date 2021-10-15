import java.util.*

fun main() {
    var scan:Scanner = Scanner(System.`in`)
    print("문자열를 입력하세요")
    var input:String = scan.nextLine()

    println("입력하신 문자열은 ? $input")

    print("한자리의 정수를 입력하세요 : ")
    var strNum:String = scan.nextLine()

    var intNum = Integer.valueOf(strNum)

    print("정수를 입력하세요 : ")
    var int:Int = scan.nextInt();
}