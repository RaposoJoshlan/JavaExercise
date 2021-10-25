package Exercises;

public class Numbers {
	
	public static int sumDigits(int number) {
		
		int sum = 0;
		
		int firstDigit = number % 10;
		
		int remainder = number / 10;
		
		int secondDigit = remainder % 10;
		
		remainder = remainder / 10;
		
		sum = firstDigit + secondDigit;
		
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumDigits(66));
	}
}
