package day3;

public class ArrayLab2 {

	public static void main(String[] args) {
		// 1. 10개의 숫자(정수)를 저장할 수 있는 배열 생성
		int[] numbers = new int[10]; 

        // 2. 각각의 element로  4부터 20사이의 난수를 추출하여 저장
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 17) + 4; // 4부터 20사이의 난수 추출
        }

        // 3. 모든 원소의 합 계산
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // 4. 결과 출력
        System.out.print("모든 원소의 값 : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // 줄바꿈
        System.out.println("모든 원소의 합 : " + sum);
	}

}
