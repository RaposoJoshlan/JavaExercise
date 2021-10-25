package Exercises;

public class FizzBuzz {

	public static String fizzBuzz(int value) {
		if (value % 3 == 0 && value % 5 == 0) {
			return "FizzBuzz";
		} else if (value % 5 == 0 && value % 3 != 0) {
			return "Buzz";
		} else if (value % 3 == 0 && value % 5 != 0) {
			return "Fizz";
		} else {
			return Integer.toString(value) + " not multiples of 3 or 5";
		}
	}

	public static void main(String[] args) {
		System.out.println(fizzBuzz(16));
	}

}
