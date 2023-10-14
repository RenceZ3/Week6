package week6;

/*
 * Clarence Juanata
 * clarence.juanata7982@nctorontostudent.ca
 * Inheritance
 */
class Employee {
	int salary = 5000;
}

public class Developer extends Employee{
	
	public static void main(String[] args) {
		Developer d1 = new Developer();
		System.out.println("The salary is " + d1.salary);
		
	}
}
