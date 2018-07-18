package HW4;

public class Student {
	private int id;
	private String col;
	private int age;

	public Student(int id, String col, int age) {
		super();
		this.id = id;
		this.col = col;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCol() {
		return col;
	}

	public void setCol(String col) {
		this.col = col;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("ID: %s; Name: %s; age: %s", getId(),  getCol(), getAge());
	}
}
