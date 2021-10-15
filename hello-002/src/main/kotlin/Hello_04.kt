fun main() {
    var num1 = 10
    for(num in 0..num1){

    }
    for(num in 0..(10-1)) {

    }
    for(num in 0..20 step 2) {

    }
    var sum = 0;
    for(num in 0..101 step 3){
        sum += num
        print("$num,")
    }
    println()
    println(sum)

    var sum2 = 0;
    for(num in 2..200) {
        if(num % 3 == 0) {
            sum2 += num
        }
    }
    println(sum2)
}