package exercise;

public class Practice12_4 {
	public static void main(String[] args) {
		double[] data = {2.5, 3.3, 7.0, -4.5, 5.2};
		
		for(double x : data) {
			if( x < 0) {
				System.out.printf("不正なデータ：%4.2f%n" , x);
				break;
			}
			System.out.printf("%4.2f%n",Math.sqrt(x));
		}
	}
}
