package Exercises;

public class Taxes {

	public static String taxPercent(int salary) {
		if (salary > 0 && salary <= 14999) {
			return "0% Tax: " + 0;
		} else if (salary >= 15000 && salary <= 19999) {
			return "10% Tax: " + (salary * 0.10);
		} else if (salary >= 20000 && salary <= 29999) {
			return "15% Tax: " + (salary * 0.15);
		} else if (salary >= 30000 && salary <= 44999) {
			return "20% Tax: " + (salary * 0.20);
		} else {
			return "25% Tax: " + (salary * 0.25);
		}
	}

	public static void main(String[] args) {
		System.out.println(taxPercent(19999));

	}
}
