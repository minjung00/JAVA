package day4;

public class LottoMachine {

	public static void main(String[] args) {
		int[] nums = new int[6]; // 로또 번호
        int count = 0;

        // 1부터 45 사이의 난수 6개 추출
        while (count < 6) {
            int number = (int) (Math.random() * 45) + 1;

            // 중복 검사
            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (nums[i] == number) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
            	nums[count] = number;
                count++;
            }
        }

        // 출력
        System.out.print("오늘의 로또 번호 - ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) { // 마지막에 , 없이 출력
                System.out.print(", ");
            }
        }
	}

}
