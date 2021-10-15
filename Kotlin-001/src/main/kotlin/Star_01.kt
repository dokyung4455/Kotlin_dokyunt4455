fun main() {


    for(num in 0 .. 5) {
        println("*".repeat(num))
    }
    println()



    for(num1 in 0 .. 5) {

        for(num2 in 0 .. num1) {
            print("*")
        }
        println()

    }
    println()
    for(num1 in 5 downTo  0) {

        for(num2 in 0 .. num1) {
            print("*")
        }
        println()

    }

}