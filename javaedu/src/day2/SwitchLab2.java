package day2;

public class SwitchLab2 {

	public static void main(String[] args) {
		// 1부터 5 사이의 랜덤값 추출
        int randomValue = (int) (Math.random() * 5) + 1;

        // 추출된 값에 따라 연산 처리
        int result = 0;
        switch (randomValue) {
        case 1:
            result = 300 + 50;
            break;
        case 2:
            result = 300 - 50;
            break;
        case 3:
            result = 300 * 50;
            break;
        case 4:
            result = 300 / 50;
            break;
        case 5:
            result = 300 % 50;
            break;
         }

        // 결과 출력
        System.out.println("결과값 : " + result);
	}

}
