package hw2;

public class ExerciseTwo {
	public static void main(String[] args) {
		int product = 1;
		for (int count = 1; count <= 10; count++) {
			product *= count;
			if (count == 10)
				System.out.println("1~10連乘的積為:" + product);
		}
	}
}
