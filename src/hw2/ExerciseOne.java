package hw2;

public class ExerciseOne {
	public static void main(String[] args) {
		int sum = 0;
		for (int count = 0; count <= 1000; count = count + 2) {
			sum += count;
			if (count == 1000) 
				System.out.println("1~1000裡的偶數總和為:" + sum);
		}
	}

}
