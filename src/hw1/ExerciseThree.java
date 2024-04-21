package hw1;

public class ExerciseThree {
	public static void main(String[] args) {
		int sec = 1, min = sec * 60, hour = min * 60, day = hour * 24;
		int time = 256559;
		int w, x, y, z;
		if (time / day != 0) {
			w = time / day;
			System.out.print(w + "天");
			if (w != 0) {
				x = time % day / hour;
				System.out.print(x + "小時");
				if (x != 0) {
					y = time % day % hour / min;
					System.out.print(y + "分鐘");
					if (y != 0) {
						z = time % day % hour % min;
						System.out.print(z + "秒");
					}
				}
			}

		}

	}
}