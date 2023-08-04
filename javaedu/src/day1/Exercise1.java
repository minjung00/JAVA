package day1;

public class Exercise1 {

	public static void main(String[] args) {
		// (1) int 타입의 변수 3개를 선언하고 각각 10, 25, 33으로 초기화
        int num1 = 10;
        int num2 = 25;
        int num3 = 33;

        // (2) 합계와 평균 계산
        int sum = num1 + num2 + num3;
        int average = sum / 3;

        // 결과 출력
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + average);
	}

}
