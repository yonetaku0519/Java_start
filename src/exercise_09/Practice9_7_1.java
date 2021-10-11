package exercise;

import lib.Input;

public class Practice9_7_1 {
	public static void main(String[] args) {
		double num = Input.getDouble("double");
		double n = num > 0 ? Math.sqrt(num) : 0;
		System.out.println(n);
	}

}
