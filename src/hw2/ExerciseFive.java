package hw2;

public class ExerciseFive {
	public static void main(String[] args) {
		int sum = 0, x = 10;
		for (int lottle = 1; lottle <= 49; lottle++) {
			if (lottle % x == 4) {
			} else if (lottle / x == 4) {
			} else {
				System.out.print(lottle + " ");
				sum++;
			}
		}
		System.out.println();
		System.out.println("總共有" + sum + "個號碼");
		System.out.println();
	}
}
