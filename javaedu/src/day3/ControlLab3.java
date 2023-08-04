package day3;

public class ControlLab3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 120; i++) {
            int num = (int) (Math.random() * 120) + 1;  // 1부터 120까지의 난수 추출
            
            if (num < 50) { // 추출된 숫자가 50 미만이면 
                System.out.printf("%d : 50 미만%n", num); //  "X : 50 미만"을 출력하고
                if (num == 3 || num == 13 || num == 23 || num == 33 || num == 43) { // 3, 13, 23, 33, 43 인 경우에만
                    System.out.printf("%d : *듀크팀*%n", num); // "X : *듀크팀*" 을 출력
                }
            } else if (num >= 50 && num <= 80) { // 추출된 숫자가 50 이상이고 80이하면
                System.out.printf("%d : 50 이상 80 이하%n", num); // "X : 50 이상 80 이하"를 출력
                if (num >= 70 && num <= 79) { // 70~79 인 경우에만  
                    System.out.printf("%d : *턱시팀*%n", num); // "X : *턱시팀*" 을 출력
                }
            } else if (num >= 81 && num <= 100) { // 추출된 숫자가 81 이상이고 100이하면  
                continue;  // 아무것도 출력하지 않고 다시 난수 추출부터 진행
            } else if (num >= 101 && num <= 120) { // 101~120 이면
                break;  // 수행 종료
            }
        }
    }
}
