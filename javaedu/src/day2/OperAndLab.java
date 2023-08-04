package day2;

public class OperAndLab {

	public static void main(String[] args) {
		// grade 라는 변수를 int 타입으로 선언하고 1 부터 6 사이의 숫자를 추출하고 저장
		int grade = (int) (Math.random() * 6) + 1;

        // grade의 값에 따라 저학년 또는 고학년임을 출력
        if (grade >= 1 && grade <= 3) {
            System.out.println(grade + " 학년은 저학년입니다.");
        } else if (grade >= 4 && grade <= 6) {
            System.out.println(grade + " 학년은 고학년입니다.");
        }
	}

}
