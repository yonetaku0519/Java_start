package exercise;

public class Practice8_2_3 {
	public static void main(String[] args) {
		double[] weight = {55.3, 60.5, 62.5, 50.2, 48.8};
		double amount = 0;
		for(int i = 0; i < weight.length; i++) {
			amount += weight[i];
		}
		System.out.println("合計=" + amount);
		System.out.println("平均=" + (amount / weight.length));
	}

}
