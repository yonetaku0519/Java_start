package exercise;

public class Pass11_2 {
	public static void main(String[] args) {
		double[] height = {175.2, 160.0, 153.6, 177.5, 185.7, 172.3, 191.3};
		int a = 0,b = 0, c = 0, d = 0;
		for(double num : height) {
			if(num < 160.0) {
				a++;
			}else if(num < 170.0) {
				b++;
			}else if(num < 180) {
				c++;
			}else {
				d++;
			}
		}
		System.out.println("A:" + a);
		System.out.println("B:" + b);
		System.out.println("C:" + c);
		System.out.println("D:" + d);
	}

}
