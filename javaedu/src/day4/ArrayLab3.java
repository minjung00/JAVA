package day4;

public class ArrayLab3 {

	public static void main(String[] args) {
		// 'J', 'a', 'v', 'a' 라는 element 로 구성되는 char 타입의 배열
		 char[] array = {'J', 'a', 'v', 'a'};

	        // 각 원소들의 값에서 대문자는 소문자로 소문자는 대문자로 변환하여 저장
	        for (int i = 0; i < array.length; i++) {
	            if (Character.isUpperCase(array[i])) {
	                array[i] = Character.toLowerCase(array[i]);
	            } else if (Character.isLowerCase(array[i])) {
	                array[i] = Character.toUpperCase(array[i]);
	            }
	        }

	        // 배열의 element들 출력
	        for (char ch : array) {
	            System.out.println(ch);
	        }
	}

}
