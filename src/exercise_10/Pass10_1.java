package exercise;

import lib.Input;

public class Pass10_1 {
	public static void main(String[] args) {
		String str;
		while((str = Input.getString()) != null) {
			int len = str.length();
			System.out.println("<" + len + ">" + str);
		}
	}

}
