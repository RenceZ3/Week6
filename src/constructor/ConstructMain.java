package constructor;

public class ConstructMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student("John", 21);
		Student s3 = new Student("Aimee");
		
		System.out.printf("\nPerson: No it's %s \n",s2.getName());
		
		s3 = new Student(15);
		
		
		if(s3.getAge() == s2.getAge()) {
			System.out.println("Person: Yes it is!");
		}else {
			System.out.println("Person: No, its " + s2.getAge());
		}
		
	}

}
