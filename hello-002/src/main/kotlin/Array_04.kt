
fun main() {
    var numbers = Array(45,{index -> index+1})
    viewList(numbers)

    println("=".repeat(50))
    numbers.shuffle()
    viewList(numbers)

    var lottoNum = numbers.slice(0..5)
    println("=".repeat(50))
    println("오늘의 행운의 번호")
    println(lottoNum)
}

fun viewList(numbers:Array<Int>) {
    for((index,num) in numbers.withIndex()) {
        print("$num,")
        if((index+1) % 5 == 0) println()
    }
}