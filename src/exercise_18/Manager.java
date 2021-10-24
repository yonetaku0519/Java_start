package exercise;

public class Manager extends Employee {
	private String title;

	public Manager(long id, String name, int salary, String title) {
		super(id, name, salary);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
