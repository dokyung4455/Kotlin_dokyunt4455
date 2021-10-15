import java.util.*

fun main() {
    var scan:Scanner = Scanner(System.`in`)
    print("첫번째 정수를 입력하세요 >>")
    var input1 = 0
    input1 = scan.nextInt()
    println()
    print("두번째 정수를 입력하세요 >>")
    var input2 = 0
    input2 = scan.nextInt()
    var mArray = view(input1,input2)
    println(mArray.get(0))
    println(mArray.get(1))
    println(mArray.get(2))
    println(mArray.get(3))

}
fun view(num1:Int,num2:Int): MutableList<String> {
    var ret1 = num1 + num2
    var ret2 = num1 - num2
    var ret3 = num1 * num2
    var ret4 = num1 / num2
    var str1 = "$num1 + $num2 = $ret1"
    var str2 = "$num1 - $num2 = $ret2"
    var str3 = "$num1 * $num2 = $ret3"
    var str4 = "$num1 / $num2 = $ret4"


    var mArray :MutableList<String> = mutableListOf()
    mArray.add(str1)
    mArray.add(str2)
    mArray.add(str3)
    mArray.add(str4)
    return mArray
}