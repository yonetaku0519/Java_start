package exercise;

public class Practice12_5 {
	public static void main(String[] args) {
		String[] msg = {"Good","Better","Best","Bad","Worse","Worst","OK"};
		for(String s : msg) {
			if(s.length() > 4) {
				continue;
			}
			System.out.println(s);
		}
	}

}
