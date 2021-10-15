import kotlin.random.Random

fun main() {
    var rnd = Random(System.currentTimeMillis())


    var rArray = arrayListOf<Int>()

    for(num in 1 .. 101) {
        var rndNum = rnd.nextInt(100)+1
        rArray.add(rndNum)
    }

    var evens = arrayListOf<Int>()
    for(num in 0 .. rArray.lastIndex){
        var dNum = rArray.get(num)
        if(dNum % 2 == 0) {
            evens.add(dNum)
        }

    }
    var evens2 = rArray.filter { it % 2 == 0 }
    println(rArray)
    println(evens)
    println(evens2)


}