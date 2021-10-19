package exercise;

import java.util.Arrays;

public class Practice13_4_4 {
	public static void main(String[] args) {
		double[] num = new double[5];
		Arrays.fill(num, 5.1);
		double[] numCopy = Arrays.copyOf(num, 10);
		System.out.println(Arrays.toString(numCopy));
	}

}
