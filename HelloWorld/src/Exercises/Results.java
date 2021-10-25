package Exercises;

public class Results {

	public int subjects(int physics, int chemistry, int biology) {
		return physics + chemistry + biology;
	}

	public int overallExam() {
		int total = subjects(100, 95, 80);
		return (total * 100) / 450;
	}

	public static void main(String[] args) {
		Results results = new Results();
		System.out.println(results.overallExam());
	}
}