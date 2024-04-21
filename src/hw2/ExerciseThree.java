package hw2;

public class ExerciseThree {
	public static void main(String[] args) {
		int product = 1, count = 1;

		while (count <= 10) {
			product *= count;
			count++;
			if (count == 10)
				System.out.println("1~10連乘的積為:" + product);
		}
	}
}
