package day5;

class Student {
	String name;
	int age;
	String subject;
	
	String getStudentInfo() {
		return name + "학생은 나이가 " + age + "세입니다.";
	}	
}
public class StudentTest {
	public static void main(String[] args) {
		Student st = new Student();
		System.out.println(st.getStudentInfo());
		st.name = "둘리";
		st.age = 10;
		st.subject = "자바";
		System.out.println(st.getStudentInfo());
		Student st1 = new Student();
		st1.name = "또치";
		st1.age = 11;
		st1.subject = "HTML";
		System.out.println(st1.getStudentInfo());
		Student st2 = new Student();
		st2.name = "도우너";
		st2.age = 10;
		st2.subject = "CSS";
		System.out.println(st2.getStudentInfo());
		System.out.println(st);
		System.out.println(st1);
		System.out.println(st2);
	}
}
