package exercise;

import lib.Input;

public class Practice12_3 {
	public static void main(String[] args) {
		int n = Input.getInt("製造番号");
		String msg = switch(n) {
			case 100 -> "イチゴ";
			case 110 -> "パイン";
			case 120 -> "メロン";
			default -> "??";
		};
		System.out.println(msg);
	}

}
