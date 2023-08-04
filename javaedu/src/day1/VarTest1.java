package day1;

public class VarTest1 {
	public static void main(String[] args) {
		int number1; // 선언만
//		System.out.println(number1); // 컴파일 에러 - num1이 초기화되지않음
		int number2 = 123;
		System.out.println(number2); // num2값 출력
		number1 = 10; // num1 초기화
		System.out.println(number1);		
		System.out.println(number2+number1);
		System.out.println(number2-number1);
		System.out.println(number2*number1);
		System.out.println(number2/number1);
		System.out.println("number1 : "+number1); // 하나라도 문자열이면, 문자열 결합
	}
}
