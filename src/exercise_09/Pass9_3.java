package exercise;

import lib.Input;

public class Pass9_3 {
	public static void main(String[] args) {
		String str = Input.getString("Are you ready?");
		String ans = str.equals("OK") || str.equals("ok") ? "おめでとう" : "残念";
		System.out.println(ans);
	}

}
