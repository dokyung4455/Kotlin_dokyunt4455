import kotlin.random.Random

fun main() {
    var rnd:Random = Random(System.currentTimeMillis())

    var star1 = rnd.nextInt(100)
    var end1 = rnd.nextInt(100)

    println("시작값 : $star1 종료값 : $end1");

    var max1 = 0;
    var min1 = 0;

    if(star1 >= end1){
        max1 = star1
        min1 = end1
    } else {
        max1 = end1
        min1 = star1
    }
    println("$max1 - $min1 = ${max1 - min1}")
    var sum1 = 0
    for(num in min1..max1) {
        if(num % 2 == 0) {
            print("$num ,")
            sum1 += num
        }
    }
    println("큰수 부터 작은수 사이의 짝수들의 합은? : $sum1")

    for(num in 0..77){} // 정상작동

    for(num in 77..0){} // 작동되지 않음

    // start1 과 end1 두 변수에 담긴 값을 비교하여
    // 작은값이 start1에 담기고 큰값이 end1에 담기도록 먼저 처리

    if(star1 > end1) {
        var temp = star1
        star1 = end1
        end1 = temp
    }

    var even = 0
    for(num in star1 .. end1) {
        if(num %2 ==0) {
            even += num
        }
    }

}