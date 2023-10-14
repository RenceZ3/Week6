package constructor;

public class Student {
	private String name;
	private int age;
	
	Student() {
		System.out.println("Default constructor...");
		System.out.println("Talking constructor\n");
	}
	
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Student(String name) {
		System.out.println("Computer: Is your name " + name + "?");
	}
	
	Student(int age) {
		this.age = age;
		System.out.println("Computer: Is your age: " + age + "?");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
}
