
// Kotlin main 진입점 함수
// Kotlin은 기본값이 class가 아니다
// 기본은 그냥 코드다
// 다만 main() 함수로 시작한다.
fun main() {
    println("우리나라 만세")

    var num1 = 10;
    var num2 = 20;
    var sum = num1 + num2;

    // 문자열 template 식
    // 문자열 내부의 $변수명 형식으로 작성하면
    // 변수값을 연산하여 문자열로 변환 후 사용할 수 있다.
    // ${연산식} 형식으로 작성하면 연산식을 연산 후
    // 결과를 문자열로 변환한 후 사용할 수 있다.
    println("$num1 + $num2 = $sum");
    println("${num1 * num2}");

    var str = "두수 $num1 과 $num2 의 덧셈 결과 : ${num1 + num2}";
    println("$str");

    // num1 은 이미 Int 형으로 선언됐기 때문에 실수형 값을 저장 할 수 없다.
//    num1 = (int)3.0

    /**
     * Kotlin 의 변수
     * Kotlin 은 변수 type 을 지정하지 않아도 선언, 생성 할 수 있다.
     * 변수는 반드시 초기값이 존재해야 한다. (var str; 식 불가)
     * Kotlin 은 변수의 초기값을 보고 변수의 type 을 자동으로 지정한다.
     *
     * 단지 변수 type 을 지정하지 않을 뿐 한번 선언도니 변수에
     * 다른 type 의 데이터(값) 을 저장 할 수는 없다.
     */

    // 정수형
    var var1:Int = 0 // 4Byte
    var var2:Long = 0L // 8Byte
    var byte1:Byte = 0 // 1Byte 정수(-128 ~ 127 까지만 저장)

    // 문자열형
    var var3:String = "Korea"

    // 문자형
    var char1:Char = 'A'

    // 실수형
    var var4:Float = 3.0F // 4Byte
    var var5:Double = 3.0 // 8Byte

    // 논리형
    var bYes:Boolean = true

}
