package exercise;

import lib.Input;

public class Pass6_4 {
	public static void main(String[] args) {
		int a = Input.getInt("a");
		int b = Input.getInt("b");
		int c = Input.getInt("c");
		
		System.out.println("a、b、cの中の最大値=" + Math.max(Math.max(a, b), c));
	}

}
