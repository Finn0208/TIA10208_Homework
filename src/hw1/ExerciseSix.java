package hw1;

public class ExerciseSix {
	public static void main(String[] args) {
		System.out.println(5 + 5); // 在未宣告資料型別的情況下輸入正整數,java預設的資料型別為int型態,故此處視作一般數學運算答案為10;
		System.out.println(5 + '5');/*
									 * ''內資料表視為char字元的資料型態,當數字型態的資料+字元,會先將字元轉為相對應的ASCII碼(16進位)後,加上數字再轉為10位表示;
									 * 此處答案為5(數字)+5(文字的ASCII碼十進位表示代碼)
									 */
		System.out.println(5 + "5");// " "內資料表示為String字串的資料型態;當數字型態的資料+字串,會變數字加文字的串接,故此處答案為5(數字)8(文字);
	}
}