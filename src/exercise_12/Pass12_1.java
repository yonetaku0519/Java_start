package exercise;

import lib.Input;

public class Pass12_1 {
	public static void main(String[] args) {
		String str = Input.getString("コード");
		int num = Input.getInt("商品の数量");
		
		int cash = switch(str) {
			case "a100" -> num * 100;
			case "a110" -> num * 200;
			case "b100" -> num * 100;
			case "b110" -> num * 200;
			case "b120" -> num * 200;
			case "c100" -> num * 300;
			case "c110" -> num * 300;
			case "d100" -> num * 400;
			default -> num * 0;
		};
		
		if(cash == 0) {
			System.out.println("商品コードが間違っています");
		} else {
			System.out.println("合計金額：" + cash);
		}
		
	}

}
