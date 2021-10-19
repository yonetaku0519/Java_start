package exercise;

import java.util.Arrays;

public class Practoce13_4_1 {
	public static void main(String[] args) {
		String[] words = {"book", "paper", "book", "pencil", "note", "eraser"};
		Arrays.sort(words);
		for(String word : words) {
			System.out.println(word);
		}
	}

}
