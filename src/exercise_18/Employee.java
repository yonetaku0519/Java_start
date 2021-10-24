package exercise;

public class Employee {
	private long id;
	private String name;
	private int salary;
	
	public Employee(long id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
