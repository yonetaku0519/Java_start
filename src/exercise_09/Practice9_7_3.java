package exercise;

import lib.Input;

public class Practice9_3 {
	public static void main(String[] args) {
		String str1 = "閏年です";
		String str2 = "閏年ではない";
		int year = Input.getInt("");
		String ans = year%4==0 && year%100!=0 || year%400==0 ? str1 : str2;
		System.out.println(ans);
	}
}
