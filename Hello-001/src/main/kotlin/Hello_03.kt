/**
 *  Kotlin 특징중 하나
 *  변수에는 절대 null 값을 저장할 수 업ㅅ다.
 *
 *  Kotlin 에서는 safe null 이라는 개념이 있다.
 */

fun main() {
    var str1 = "Korea"

    // 제한적으로 str2 변수는 null을 저장할 수 있다.
    var str2:String? = null
    println(str2.toString())

    if(str2 == null) {
        println("str2 는 null")
    }

    // JS code : str = num || "str2 는 null"
    println(str2?:"str2 는 null")
}