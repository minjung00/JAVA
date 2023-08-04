package day2;

public class AlphaTest {

	public static void main(String[] args) {
		// num 변수를 int 타입으로 선언하여 1~26 사이의 난수값을 추출하여 저장
        int num = (int) (Math.random() * 26) + 1;

        // num이 1이면 'A' 문자, 2면 'B' 문자 .... 26이면 'Z' 문자를  출력
        System.out.println("추출된 숫자: " + num);
        char ch = (char) ('A' + num - 1);
        System.out.println(ch);
	}

}
