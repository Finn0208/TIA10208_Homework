package hw2;

public class ExerciSeven {
	public static void main(String[] args) {
		int num1, num2, num3;
		for (num1 = 0; num1 <= 5; num1++) { 
			for (num2 = 0; num2 <= num1; num2++) { 
				num3 = 65 + num1;
				char num4 = (char) num3; 
				System.out.print(num4);
			}
			System.out.println();
		}

	}

}