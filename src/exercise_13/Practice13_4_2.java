package exercise;

import java.util.Arrays;

import lib.Input;

public class Practice13_4_2 {
	public static void main(String[] args) {
		String[] words = {"book", "paper", "book", "pencil", "note", "eraser"};
		Arrays.sort(words);
		String key = Input.getString();
		int index = Arrays.binarySearch(words, key);
		System.out.println("検索結果=" + index);
	}

}
