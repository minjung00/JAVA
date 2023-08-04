package day2;

public class ConditionOperLab {

	public static void main(String[] args) {
		// 1부터 5 사이의 랜덤값 추출
        int randomValue = (int) (Math.random() * 5) + 1;

        // 추출된 값에 따라 연산 처리
        int result = 0;
        if (randomValue == 1) {
            result = 300 + 50;
        } else if (randomValue == 2) {
            result = 300 - 50;
        } else if (randomValue == 3) {
            result = 300 * 50;
        } else if (randomValue == 4) {
            result = 300 / 50;
        } else if (randomValue == 5) {
            result = 300 % 50;
        }

        // 결과 출력
        System.out.println("결과값 : " + result);
	}

}
