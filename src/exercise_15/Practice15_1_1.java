package exercise;

import lib.Input;

public class Practice15_1_1 {
	public static void main(String[] args) {
		String nengo = Input.getString("年号");
		int wareki = Input.getInt("和暦年");
		System.out.println("西暦年=" + MyTools.calconv(nengo, wareki));
	}

}
