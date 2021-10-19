package exercise;

import java.util.Arrays;

public class Practice13_4_5 {
	public static void main(String[] args) {
		double[] num = {2.8, -3.3, 1.5, -5.2, 4.2, 8.1};
		double sum = Arrays.stream(num)
						.filter(n->n>0)
						.sum();
		System.out.println("合計=" + sum);
	}

}
