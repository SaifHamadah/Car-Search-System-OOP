package carShowSystem;

public class Car extends Vehicle {
	private String behavior;
	private String driveType;
	private double height;
	private static int counter = 0;		//static variable to count the number of cars
	public Car(String brand, String model, int year, String color, String fuelType, int topSpeed, String transmissionType,
			int engineS, int engineH, String behavior, String driveType, double height) {		//constructor
		super(brand, model, year, color, fuelType, topSpeed, transmissionType, engineS, engineH);		//parent class constructor
		setBehavior(behavior);			//call the setter function
		setDriveType(driveType);		//call the setter function
		setHeight(height);				//call the setter function
		counter++;			//to update the value of the counter when we create an object using this constructor
	}
	
	public static int getCounter() {		//getter function
		return counter;
	}

	public static void setCounter(int counter) {		//setter function
		Car.counter = counter;
	}

	public String getBehavior() {		//getter function
		return behavior;
	}
	public void setBehavior(String behavior) {			//setter function
		this.behavior = behavior;
	}
	public String getDriveType() {		//getter function
		return driveType;
	}
	public void setDriveType(String driveType) {		//setter function
		this.driveType = driveType;
	}
	public double getHeight() {			//getter function
		return height;
	}
	public void setHeight(double height) {			//setter function
		this.height = height;
	}
	public void printCarInfo()		//print function to print this class attributes , we use when we create an object using this class constructor
	{
		super.printCarInfo();		//override function , the function in the super class
		System.out.println("The abilities of this car : "+getBehavior());		//using the getter function to print the info
		System.out.println("The drive type : "+getDriveType());					//using the getter function to print the info
		System.out.println("The height of the car : "+getHeight());				//using the getter function to print the info
		
	}
	public void printClassInfo()	//we use this function in the polymorphism class , when we create an object using the polymorphism constructor
	{
		super.printCarInfo();		//override function , the function in the super class
	}
	
	
	
}
