package exercise;

public class Denpyo {
	private int number;
	private String date;
	private String item;
	private int price;
	private int quantity;
	
	public Denpyo(int number, String date, String item, int price, int quantity) {
		this.number = number;
		this.date = date;
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}

	public int getNumber() {
		return number;
	}

	public String getDate() {
		return date;
	}

	public String getItem() {
		return item;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
