package exercise;

import lib.Input;

public class Pass12_2 {
	public static void main(String[] args) {
		int num = Input.getInt("月");
		String str = switch(num) {
			case 12 -> "冬です";
			case 1 -> "冬です";
			case 2 -> "冬です";
			case 3 -> "春です";
			case 4 -> "春です";
			case 5 -> "春です";
			case 6 -> "夏です";
			case 7 -> "夏です";
			case 8 -> "夏です";
			case 9 -> "秋です";
			case 10 -> "秋です";
			case 11 -> "秋です";
			default -> "入力エラーです";
		};
		System.out.println("季節は" + str);
	}

}
