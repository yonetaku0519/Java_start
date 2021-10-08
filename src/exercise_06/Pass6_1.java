package exercise;

import lib.Input;

public class Pass6_1 {
	public static void main(String[] args) {
		double a = Input.getDouble("角度：");
		double b = Math.toRadians(a);
		System.out.printf("sin = %6.3f%n", Math.sin(b));
		System.out.printf("cos = %6.3f%n", Math.cos(b));
	}

}
