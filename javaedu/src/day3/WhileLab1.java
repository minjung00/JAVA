package day3;

public class WhileLab1 {

	public static void main(String[] args) {
		 // 5부터 10사이의 난수를 추출
		 int num = (int) (Math.random() * 6) + 5;

		    // for 구현
	        System.out.println("[ for 결과 ]");
	        for (int i = 1; i <= num; i++) {
	            int square = i * i;
	            System.out.println(i + " -> " + square);
	        }

	        // while 구현
	        System.out.println("[ while 결과 ]");
	        int i = 1;
	        while (i <= num) {
	            int square = i * i;
	            System.out.println(i + " -> " + square);
	            i++;
	        }
	}

}
