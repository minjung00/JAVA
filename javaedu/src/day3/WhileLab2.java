package day3;

public class WhileLab2 {

	public static void main(String[] args) {
		while (true) {
			// 1부터 6사이의 두개 난수를 추출하여 각각 pairNum1, pairNum2 에 저장
            int pairNum1 = (int) (Math.random() * 6) + 1;
            int pairNum2 = (int) (Math.random() * 6) + 1;

            // pairNum1, pairNum2 출력
            System.out.println("pairNum1: " + pairNum1);
            System.out.println("pairNum2: " + pairNum2);

            // 추출된 두 개의 숫자가 서로 다르면 값의 크기를 비교
            if (pairNum1 != pairNum2) {
                if (pairNum1 > pairNum2) {
                    System.out.println("pairNum1이 pairNum2 보다 크다.");
                } else {
                    System.out.println("pairNum1이 pairNum2 보다 작다.");
                }
            } else { // 추출된 두 개의 숫자가 동일하면 "게임 끝"이라는 메시지를 출력하고 종료
                System.out.println("게임 끝");
                break;
            }
        }
	}

}
