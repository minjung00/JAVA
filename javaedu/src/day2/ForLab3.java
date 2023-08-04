package day2;

public class ForLab3 {

	public static void main(String[] args) {
		int Random_1 = (int) (Math.random() * 10) + 1; // 1부터 10사이의 난수를 하나 추출
        int Random_2 = (int) (Math.random() * 11) + 30; // 30부터 40사이의 난수를 하나 추출

        
        int start = Math.min(Random_1, Random_2); // 두 난수 중 최솟값을 시작값으로 설정
        int end = Math.max(Random_1, Random_2); // 두 난수 중 최댓값을 끝값으로 설정

     // 첫번째 난수부터 두번째 난수 까지의 숫자들 중에서 짝수의 합 구하기
        int evenNum = 0; 
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) { // 짝수인 경우
            	evenNum += i;
            }
        }

        System.out.println(start + " 부터 " + end + " 까지의 짝수의 합 : " + evenNum);

	}

}
