package day3;

public class ControlLab2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) { // 1부터 10까지의 값 반복
            if (i % 3 == 0 || i % 4 == 0) { // 3의 배수와 4의 배수는 제외하고 반복
                continue;  
            }
            System.out.println(i);
        }
	}

}
