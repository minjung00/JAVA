package day5;

class MyObject{
	public String toString() {
		return "MyObject2 클래스의 객체";
	}
}

public class MyObjectTest {

	public static void main(String[] args) {
		MyObject obj = new MyObject();
		System.out.println(obj.toString());
		System.out.println(obj);
		java.util.Date d = new java.util.Date();
		System.out.println(d);
		MyObject2 obj2 = new MyObject2();
		System.out.println(obj2);

	}

}
