package hw2;

public class NineNineLoop {
	public static void main(String[] args) {
		int i, y;
		for (i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				j++;
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
		System.out.println("========================================================================>");

		for (int x = 1; x <= 9; x++) {
			y = 1;
			do {
				System.out.print(x + "*" + y + "=" + x * y + "\t");
				y++;
			} while (y <= 9);
			System.out.println();
		}
		System.out.println("========================================================================>");

		int s = 1, d = 1;
			do {
				System.out.print(s + "*" + d + "=" + s * d + "\t");
				s++;
			} while (d <=9);
			while (s <= 9) {
				d++;
		}
		System.out.println();
		System.out.println("========================================================================>");
	}
}