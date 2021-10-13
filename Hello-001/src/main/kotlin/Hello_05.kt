fun main() {

    /**
     * var : 내용이 변경 가능한 변수
     * val : 한번 저장되면 내용을 변경이 불가능한 변수
     */
    val  str1 = "Korea"
//    str1 = "Republic of Korea" : 오류발생

    // listOf() 리스트형 변수를 생성하는 함수수
   val 과일들 = listOf("사과","바나나","오렌지")
    for(과일 in 과일들) {
        print("$과일, ")
    }
    
    println("반갑습니다")
    for(index in 과일들.indices) {
        println("$index 번째 : ${과일들[index]}")
    }

    if(3 in 1..10) {println("있어")}
    for(num in 1..10) {
        if(num == 3) {
            println("있다.")
        }
    }

    // 과일들 중 사과가 있나?
    if("사과" in 과일들) {
        println("사과 있음")
    }
    // 과일들 중 배는 없냐?
    if("배" !in 과일들) {
        println("배는 없음")
    }
}