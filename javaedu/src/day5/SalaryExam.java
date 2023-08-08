package day5;

import java.util.Scanner;

class SalaryExpr {
    private int bonus;

    // 멤버변수 bonus 에 0을 할당
    public SalaryExpr() {
        this.bonus = 0;
    }

    // 멤버변수에 매개변수 bonus 값을 할당
    public SalaryExpr(int bonus) {
        this.bonus = bonus;
    }

    public int getSalary(int grade) {
        int salary = 0;

        switch (grade) {
            case 1:
                salary = bonus + 100;
                break;
            case 2:
                salary = bonus + 90;
                break;
            case 3:
                salary = bonus + 80;
                break;
            case 4:
                salary = bonus + 70;
                break;
        }

        return salary;
    }
}

public class SalaryExam {
    public static void main(String[] args) {
    	//Scanner 클래스를 사용해서 표준입력으로 월 정보와 등급정보를 입력받음
        Scanner scanner = new Scanner(System.in);

        System.out.print("월(1-12)을 입력하세요 : ");
        int month = scanner.nextInt();

        System.out.print("등급(1-4)을 입력하세요 : ");
        int grade = scanner.nextInt();

        SalaryExpr salaryExpr;

        if (month % 2 == 0) { // 짝수달은 보너스 달
            salaryExpr = new SalaryExpr(100);
        } else { // 홀수달은 보너스 달이 아님
            salaryExpr = new SalaryExpr();
        }

        int salary = salaryExpr.getSalary(grade);

        //출력
        System.out.println(month + " 월 " + grade + " 등급의 월급은 " + salary + " 입니다.");

        scanner.close();
    }
}
