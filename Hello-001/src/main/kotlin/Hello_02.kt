fun main(args: Array<String>) {
    var num1 = 30;
    var num2 = 30.0;

    // num2 변수에 담긴 값을 num1 변수에 할당한다.
    // 실수형 변수 num2 에 담긴 값을 강제로 정수형으로 변환(toInt()) 하여
    // 정수형 변수 num1 에 저장하라.
    num1 = num2.toInt(); // Integer.valueOf(num2), Integer.parseInt(num2)

    // 문자열형 숫자
    var str = "12345"   
    // 문자열형 숫자를 정수형 숫자로 변환하여 정수형 변수에 담기
    num1 = Integer.parseInt(str)

}