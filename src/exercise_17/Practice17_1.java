package exercise;

import sample.Sales;

public class Practice17_1 {
	public static void main(String[] args) {
		Sales[] sales = {
				new Sales("SY-200", "冷蔵庫", 50000, 20, true),
				new Sales("TB-100", "洗濯機", 30000, 15, true),
				new Sales("AX-551", "テレビ", 15000, 32, false),
				new Sales("XS-112", "掃除機", 22000, 23, false)
		};
		
		for(Sales s : sales) {
			if(s.isHightSales()) {
				System.out.print(s.getCode() + " ");
				System.out.print(s.getName() + " ");
				System.out.print(s.getPrice() + " ");
				System.out.print(s.getQuantity() + " ");
				System.out.println(s.isStock() + " ");
			}
		}
	}

}
