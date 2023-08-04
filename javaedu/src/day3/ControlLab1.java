package day3;

public class ControlLab1 {

	public static void main(String[] args) {
		int count = 0;

        while (true) {
            int num = (int) (Math.random() * 11) + 10;  // 10부터 20사이의 난수 추출

            if (num % 3 == 0 || num % 5 == 0) { // 추출된 숫자가 3의 배수이거나 5의 배수이면
                int sum = 0;
                for (int i = 1; i <= num; i++) { // 1부터 이 숫자까지의 합을 출력
                    sum += i;
                }
                System.out.println("1부터 " + num + "까지의 합: " + sum);
            } else if (num == 11 || num == 17 || num == 19) { // 추출된 숫자가 11 이거나 17이거나 19이면
                System.out.println(count + "회 반복함"); // "x회 반복함" 를 출력
                break; // 반복문을 종료
            } else { // 위에서 제시한 조건 외의 값이 추출
                System.out.println("재수행"); // "재수행" 이라는 메시지를 출력
            }

            count++;
        }
	}

}
