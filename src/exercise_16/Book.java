package exercise;

public class Book {
	String isbn;
	String title;
	public Book(String isbn, String title) {
		this.isbn = isbn;
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
