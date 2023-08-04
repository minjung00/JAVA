package day3;

public class WhileLab3 {

	public static void main(String[] args) {
		int count = 0;

        while (true) {
        	// 0부터 30사이의 난수를 추출
            int num = (int) (Math.random() * 31);

            // 0이 추출되거나  27~30이 추출되면 반복 끝냄
            if (num == 0 || (num >= 27 && num <= 30)) {
                break;
            }
            
            char letter = (char) ('A' + (num - 1)); // 난수에 해당하는 문자 생성
            int num_10 = (int) num + 64; // 10진수 생성
            
            //16진수 생성
            String num_16 = ""; // 16진수를 저장할 문자열

            int temp = num_10;
            while (temp > 0) {
                int remainder = temp % 16; // 16진수 변환을 위한 나머지 계산

                if (remainder < 10) {
                    num_16 = (char) ('0' + remainder) + num_16; // 0~9까지는 그대로 추가
                } else {
                    num_16 = (char) ('A' + (remainder - 10)) + num_16; // 10~15는 A~F로 변환하여 추가
                }

                temp /= 16;
            }

            System.out.printf("%d-%c, %d, 0x%s%n", num, letter, num_10, num_16);
            count++; 
        }

        System.out.println("출력횟수는 " + count + " 번입니다.");

	}

}
