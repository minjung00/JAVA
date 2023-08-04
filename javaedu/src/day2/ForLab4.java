package day2;

public class ForLab4 {

	public static void main(String[] args) {
		int evenNum = 0; // 짝수의 합
        int oddNum = 0; // 홀수의 합

        // 1 부터 100 까지의 값 반복
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // 짝수의 합 구하기
                evenNum += i;
            } else { // 홀수의 합 구하기
                oddNum += i;
            }
        }

        System.out.println("1부터 100까지의 숫자들 중에서");
        System.out.println("짝수의 합은 " + evenNum + "이고");
        System.out.println("홀수의 합은 " + oddNum + "이다.");
	}

}
