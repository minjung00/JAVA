package day2;

public class TimeTest {

	public static void main(String[] args) {
		// time 변수를 int 타입으로 선언하여 32150(초)이라는 값을 저장
        int time = 32150;

        // time 변수의 값을 가지고 연산식을 만들어  "XX시간 XX분 XX초" 형식으로 변환하여 화면에 출력
        int hours = time / 3600; 
        int minutes = (time % 3600) / 60; 
        int seconds = time % 60; 

        // 결과를 화면에 출력
        System.out.println(hours + "시간 " + minutes + "분 " + seconds + "초");
	}

}
