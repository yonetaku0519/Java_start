package exercise;

import lib.Input;

public class Practice12_2 {
	public static void main(String[] args) {
		String str = Input.getString();
		switch(str) {
			case "j" :
			case "J" : 
				System.out.println("Java言語");
				break;
			case "c" :
			case "C" :
				System.out.println("C言語");
				break;
			default :
				System.out.println("その他の言語");
		}
	}
}
