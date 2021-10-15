import java.util.*

fun main() {
    var scan:Scanner = Scanner(System.`in`)
    print("첫번째 정수를 입력하세요 >>")
    var input1 = 0
    try {
        input1 = scan.nextInt()
    } catch (e:Exception) {
        println("정수만 입력가능")
        return
    }

    println()
    print("두번째 정수를 입력하세요 >>")
    var input2 = 0
    try {
        input2 = scan.nextInt()
    } catch (e:Exception) {
        println("정수만 입력가능")
        return
    }
    var max = 0
    var min = 0
    if(input1 >= input2){
        max = input1
        min = input2
    } else {
        max = input2
        min = input1
    }
    var mArray = view(max,min)
    for(num in mArray) {
        println(num)
    }

}
