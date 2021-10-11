package exercise;

import lib.Input;

public class Practice10_2_1 {
	public static void main(String[] args) {
		double num;
		while((num = Input.getDouble()) != 0) {
			System.out.println(Math.sqrt(num));
		}
	}

}
