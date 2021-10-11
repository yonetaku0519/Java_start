import lib.Input;

public class Pass10_2 {
	public static void main(String[] args) {
		double input,sum = 0;
		int count = 0;
		while((input = Input.getDouble()) != 0) {
			sum += input;
			count++;
			
		}
		
		System.out.printf("合計=%6.2%n" + sum);
		System.out.println("件数=" + count);
		System.out.println("平均=%6.2%n" + sum / count);
	}

}
