package day3;

public class ArrayLab1 {

	public static void main(String[] args) {
		 // 1. int 타입의 배열 변수 선언
        int[] ary = new int[10];

        // 2. 배열의 값들을 하나의 행에 출력
        for (int value : ary) {
            System.out.print(value + " ");
        }
        System.out.println(); // 줄바꿈

        // 3. 생성된 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 을 각각의 element 로 저장
        ary[0] = 10;
        ary[1] = 20;
        ary[2] = 30;
        ary[3] = 40;
        ary[4] = 50;
        ary[5] = 60;
        ary[6] = 70;
        ary[7] = 80;
        ary[8] = 90;
        ary[9] = 100;

        // 4. 첫 번째 원소와 마지막 원소만 출력하고 합도 출력
        System.out.println("첫 번째 : " + ary[0]);
        System.out.println("마지막 : " + ary[9]);

        int sum = 0; // 합 출력
        for (int value : ary) {
            sum += value;
        }
        System.out.println("합 : " + sum);

        // 5. 배열의 값들을 하나의 행에 출력
        for (int value : ary) {
            System.out.print(value + " ");
        }
        System.out.println(); // 줄바꿈

        // 6. 배열의 값들을 하나의 행에 역순으로 출력
        for (int i = ary.length - 1; i >= 0; i--) {
            System.out.print(ary[i] + " ");
        }
        System.out.println(); // 줄바꿈

        // 7. 짝수 배열의 값들을 하나의 행에 출력
        for (int value : ary) {
            if (value % 2 == 0) {
                System.out.print(value + " ");
            }
        }
        System.out.println(); // 줄바꿈
	}

}
