package day2;

public class ForLab2 {

	public static void main(String[] args) {
		// 9부터 4까지의 숫자를 반복
		for (int i = 9; i >= 4; i--) {
            if (i % 2 == 0) {// 짝수인 경우
                System.out.println(i + " : 짝수");
            } else { // 홀수인 경우
                System.out.println(i + " : 홀수");
            }
        }

	}

}
