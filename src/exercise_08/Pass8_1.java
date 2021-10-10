package exercise;

public class Pass8_1 {
	public static void main(String[] args) {
		double[] data = {12.3, 13.5, 11.5, 13.0, 12.8, 12.5};
		double sum = 0;
		double average = 0;
		
		for(double num : data) {
			sum += num;
		}
		
		average = sum / data.length;
		
		System.out.println("合計=" + sum);
		System.out.println("平均=" + average);
		
		for(double num : data) {
			System.out.print(num + "\t");
		}
	}
}
