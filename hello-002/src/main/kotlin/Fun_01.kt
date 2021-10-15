
// 진입점 함수
fun main() {
    var result1 = add(100,200)
    var result2 = add(100.0F,200.0F)
}

// 함수를 사용하여 코드 분리하기
// fun 키워드를 사용하여 함수를 정의 한다.
// fun 함수명(매개변수:type) : return type {}

/**
 * 함수형 프로그래밍
 * 순수함수 개념
 * 매개변수로 전달받은 값을 변경하지 않고
 * 다른 연산의 기초 데이터로만 활용하는 함수
 * java 에서 method 는 매개변수로 전달받은 변수에 변경을
 * 연산을 통해 값을 저장, 수정, 삭제 할 수 있다.
 * 단순히 매개변수에 어떤 값을 할당 할 수도 있다.
 * 하지만,
 * Kotlin 에서는 매개변수를 절대 변경 할 수 없는 규칙이 있다.
 * 순수 함수를 유지하기 위한 Kotlin 의 정책
 *
 *
 */
// public Integer add(Integer num1, Integer num2)
fun add(num1:Int, num2:Int):Int {
//    num1 += 10
//    num2 += 20
    var sum = num1 + num2
    return sum
}
fun add(num1:Float, num2:Float):Float {
    return num1 + num2
}