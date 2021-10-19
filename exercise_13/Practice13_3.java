package exercise;

import lib.Input;

public class Practice13_3 {
	public static void main(String[] args) {
		double[] num = new double[5];
		for(int i = 0; i < num.length; i++) {
			num[i] = Input.getDouble("double");
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
