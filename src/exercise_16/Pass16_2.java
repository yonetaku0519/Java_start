package exercise;

public class Pass16_2 {
	public static void main(String[] args) {
		Denpyo d1 = new Denpyo(1025, "2020-01-08", "パソコン", 50000, 1);
		Denpyo d2 = new Denpyo(1026, "2020-01-10", "コピー用紙", 1500, 5);
		
		d1.setQuantity(2);
	
		text(d1);
		text(d2);
	}
	
	public static void text(Denpyo a) {
        System.out.print(a.getNumber()+" ");
        System.out.print(a.getDate()+" ");
        System.out.print(a.getItem()+" ");
        System.out.print(a.getPrice()+" ");
        System.out.println(a.getQuantity());
   }

}
