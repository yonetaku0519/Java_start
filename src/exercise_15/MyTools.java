package exercise;

import java.util.Arrays;

public class MyTools {
	
	public static double bmi(double weight, double height) {
		double value = weight / Math.pow(height, 2);
		return value;
	}
	
	
	public static int calconv(String nengo, int wareki) {
		int seireki = switch(nengo) {
						case "s", "S" -> wareki + 1925;
						case "h", "H" -> wareki + 1988;
						case "r", "R" -> wareki + 2018;
						default -> wareki;
					};
		return seireki;
	}
	
	
	public static String padding(String word, int len) {
		String result;
		if(len > word.length()) {
			result = word + " ".repeat(len - word.length());
		} else {
			result = word;
		}
		
		return result;
	}
	
	public static void stdWeight(double height) {
		double result = (height - 100) * 0.9;
		System.out.println("" + result);
	}
	
	public static int sum(int[] data) {
		return Arrays.stream(data).sum();
	}
	
	public static int max(int[] data) {
//		Arrays.sort(data);
//		return data[data.length - 1];
		int max = 0;
		for(int num : data) {
			if(max < num) {
				max = num;
			}
		}
		return max;
		
	}
	
	
	public static void graph(int num) {
		String str = "#";
		String result = str.repeat(num);
		System.out.println(result);
	}
	
}
