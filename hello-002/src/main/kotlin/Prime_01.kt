import kotlin.random.Random

fun main() {
    var rnd:Random = Random(System.currentTimeMillis())

    var num = rnd.nextInt(100)+2
    
    var bPrimeYes = true
    for(index in 2 until num) {
        if(num % index == 0 ) {
            bPrimeYes = false
            break
        }
    }
    if(bPrimeYes) {
        println("$num 은 소수")
    } else {
        println("$num 은 소수가 아님")
    }

    var index = 2
    while (index <= num / 2) {
        if(num % index == 0) {
            break
        }
        index ++
    }
    if(index >= num) {
        println("$num 은 소수")
    } else {
        println("$num 은 소수가 아님")
    }
}