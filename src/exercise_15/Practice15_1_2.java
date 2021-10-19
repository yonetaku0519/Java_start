package exercise;

import lib.Input;

public class Practice15_1_2 {
	public static void main(String[] args) {
		String str, join = "";
		while((str = Input.getString()) != null) {
			join += MyTools.padding(str, 10);
		}
		System.out.println(join);
	}

}
