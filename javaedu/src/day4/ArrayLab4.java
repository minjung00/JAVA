package day4;

public class ArrayLab4 {

	public static void main(String[] args) {
		int[] int_array = new int[10];

        // 5부터 10사이의 난수를 추출
        for (int i = 0; i < int_array.length; i++) {
        	int_array[i] = (int) (Math.random() * 6) + 5;
        }

        // int 타입의 배열과 동일한 크기를 갖는 char 타입의 배열을 생성
        char[] char_array = new char[int_array.length];

        // int 타입의 배열에 저장된 각각의 원소값을 알파벳 소문자를 원소값으로 저장
        for (int i = 0; i < char_array.length; i++) {
        	char_array[i] = (char) ('a' + int_array[i] - 1);
        }

        // int 배열 원소값 출력
        for (int i = 0; i < int_array.length; i++) {
            System.out.print(int_array[i]);
            if (i < int_array.length - 1) { // 마지막에 , 없이 출력
                System.out.print(",");
            }
        }
        System.out.println();

        // char 배열 원소값 출력
        for (int i = 0; i < char_array.length; i++) {
            System.out.print(char_array[i]);
            if (i < char_array.length - 1) { // 마지막에 , 없이 출력
                System.out.print(",");
            }
        }
	}

}
