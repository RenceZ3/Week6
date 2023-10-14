package vehicle;

class SportVehicle {
	String manufacturer;
	double price;
}

class SUV extends SportVehicle{
	int passenger;
	int doors;
}

class Sedan extends SportVehicle{
	String model;
}



public class VehicleMain {

	public static void main(String[] args) {
		
		
		SUV car1 = new SUV();
		String manu1 = car1.manufacturer = "Toyota";
		int pass1 = car1.passenger = 2;

		System.out.println("SUV Details");
		System.out.println("===================================");
		System.out.printf("Manufacturer:\t%s \nPassenger:\t%d\n\n", manu1, pass1);
		
		Sedan car2 = new Sedan();
		String manu2 = car2.manufacturer = "Honda";
		String model = car2.model = "2023";
		
		
		System.out.println("Sedan Details");
		System.out.println("===================================");
		System.out.printf("Manufacturer:\t%s \nPassenger:\t%s\n", manu2, model);

	}

}
