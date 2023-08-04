package day1;

public class Exercise2 {

	public static void main(String[] args) {
		// (1) int 타입의 변수 2개를 선언하고 각각 35, 10으로 초기화
        int num1 = 35;
        int num2 = 10;

        // (2) 나눈 몫과 나머지 계산
        int q = num1 / num2;
        int r = num1 % num2;

        // 결과 출력
        System.out.println(num1 + " 를 " + num2 + " 으로 나눈 결과 몫은 " + q + " 이고 나머지는 " + r + " 입니다.");
	}

}
