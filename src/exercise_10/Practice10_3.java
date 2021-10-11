package exercise;

import lib.Input;

public class Practice10_3 {
	public static void main(String[] args) {
		double sum = 0;
		double n = 0;
		while((n=Input.getDouble()) != 0) {
			sum += n;
		}
		System.out.printf("合計=%6.2f%n", sum);
	}
}
