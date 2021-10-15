import kotlin.random.Random

fun main() {
    var rnd:Random = Random(System.currentTimeMillis())
    var num1:Int = rnd.nextInt(100)


    var result:String = when (num1 % 3 ){
        0->"3의 배수"
        1->"글쎄"
        2->"결과가 2면 뭘까"
        else->"알수없음"
    }
}

