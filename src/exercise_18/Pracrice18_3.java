package exercise;

public class Practice18_3 {
	public static void main(String[] args) {
		Manager m = new Manager(1234, "佐藤", 300000, "主任");
		System.out.println(m.getId() + "/" + m.getName() + "/" + m.getSalary() + "/" + m.getTitle());
	}

}
