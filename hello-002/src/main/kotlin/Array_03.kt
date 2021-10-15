fun main() {

    // key 와 value 를 쌍으로 갖는 데이터 타입
    val map1 = mapOf(
        "name" to "홍길동",
        "tel" to "010-7554-5140",
        "addr" to "서울특별시"

    )
    println(map1["name"])
    for((key, value) in map1) {
        println("Key : $key, Value : $value")
    }

    val map2 = mutableMapOf(
        "이름" to "이몽룡",
        "전화번호" to "010-4514-5222",
        "주소" to "광주광역시"
    )
    println(map2)
    map2["이름"] = "성춘향"
    println(map2)
}