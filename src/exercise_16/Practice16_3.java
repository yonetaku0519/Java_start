package exercise;

public class Practice16_3 {
	public static void main(String[] args) {
		Order o1 = new Order("ICBK61","2020-07-11",2100,5,true);
		System.out.println("型番　　= " + o1.getId());
		System.out.println("受注日　= " + o1.getDate());
		System.out.println("価格　　= " + o1.getPrice());
		System.out.println("個数　　= " + o1.getQuantity());
		System.out.println("納品　　= " + o1.isDelivery());
	}

}
