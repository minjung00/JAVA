package day2;

public class OperTest12 {

	public static void main(String[] args) {
		int num = 100; // int(long), double, char
		
		System.out.println(num > 100 && ++num == 101); 
		System.out.println(num);  
		
		System.out.println(num > 100 || ++num == 101); 
		System.out.println(num);  
	}

}
