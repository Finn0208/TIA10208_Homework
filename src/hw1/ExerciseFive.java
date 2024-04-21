package hw1;

public class ExerciseFive {
	public static void main(String[] args) {
		// 期末本利和＝期初本金×（1＋利率）期數次方。
		double principal = 1_500_000;
		double rate = 1.02;
		double periodYear = 10;
		double deposit = 0;

		for (double interest = 1.02, base = 1; base <= periodYear; base++) {
			if (base % periodYear != 0) {
				interest = interest * rate;
				continue;
			}
			if (base == periodYear) {
				System.out.print("本金加利息一共有:");
				System.out.print(deposit = principal * interest);
				System.out.print("元");
			}
		}
	}
}