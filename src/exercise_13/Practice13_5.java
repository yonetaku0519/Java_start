package exercise;

public class Practice13_5 {
	public static void main(String[] args) {
		double[][] temp = {
								{-2.0,7.0,6.1,6.6,16.9},
				                {5.5,12.4,13.6,13.8,21.2},
				                {22.1,18.9,27.9,27.7,28.7},
				                {12.2,28.9,19.9,20.0,25.7}
		                   };
		for(double[] row : temp) {
			for(double n : row) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}
	}

}
