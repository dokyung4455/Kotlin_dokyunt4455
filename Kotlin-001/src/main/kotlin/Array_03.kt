import java.util.*
import kotlin.collections.ArrayList

fun main() {


    var rnd = Random(System.currentTimeMillis())
    var array = arrayListOf<Int>()
    for(num in 0 .. 100) {
        var rndNum = rnd.nextInt(100)+1
        array.add(rndNum)
    }

    var prime = arrayListOf<Int>()



    for(num1 in 1 .. array.lastIndex) {
        var bYes = true



        for(num2 in 2 until array.get(num1)) {
            if(array.get(num1) % num2 == 0) {
                bYes = false
                break
            }
        }
        if( bYes == true ) {
            prime.add(array.get(num1))
        }
    }
    println(array)
    println(prime)

    var prime2 = array.filter {
        for(num in 2 until it) {
            if(num % it == 0) return false
        }
    }

}