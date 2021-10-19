package exercise;

import java.util.Arrays;

public class Practice13_4_3 {
	public static void main(String[] args) {
		String[] words = {"book", "paper", "book", "pencil", "note", "eraser"};
		Arrays.stream(words)
				.sorted()
				.distinct()
				.forEach(word->System.out.println(word));
	}

}
