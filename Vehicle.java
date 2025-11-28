package carShowSystem;

public class Vehicle {
	private String brand;
	private String model;
	private int year;
	private String color;
	private String fuelType;
	private int topSpeed;
	private String transmissionType;
	private engine e1;			//declaring an object for the composition
	private int engineS;		//attributes for the composition object
	private int engineH;		//attributes for the composition object
	public Vehicle(String brand, String model, int year, String color, String fuelType, int topSpeed,
			String transmissionType, int engineS, int engineH) {		//constructor
		setBrand(brand);		//call the setter function
		setModel(model);		//call the setter function
		setYear(year);			//call the setter function
		setColor(color);		//call the setter function
		setFuelType(fuelType);	//call the setter function
		setTopSpeed(topSpeed);	//call the setter function
		setTransmissionType(transmissionType);		//call the setter function
		e1=new engine(engineS,engineH);				//creating the object for the composition
	}
	public String getBrand() {			//getter function
		return brand;
	}
	public void setBrand(String brand) {	//setter function
		this.brand = brand;
	}
	public String getModel() {			//getter function
		return model;
	}
	public void setModel(String model) {	//setter function
		this.model = model;
	}
	public int getYear() {				//getter function
		return year;
	}
	public void setYear(int year) {			//setter function
		this.year = year;
	}
	public String getColor() {			//getter function
		return color;
	}
	public void setColor(String color) {		//setter function
		this.color = color;
	}
	public String getFuelType() {		//getter function
		return fuelType;
	}
	public void setFuelType(String fuelType) {		//setter function
		this.fuelType = fuelType;
	}
	public int getTopSpeed() {			//getter function
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {		//setter function
		this.topSpeed = topSpeed;
	}
	public String getTransmissionType() {	//getter function
		return transmissionType;
	}
	public void setTransmissionType(String transmissionType) {		//setter function
		this.transmissionType = transmissionType;
	}
	public void printCarInfo()		//print function to print the attributes of this class and the composition class
	{
		System.out.println("The brand of the car is : "+getBrand());		//using the getter function to print the info
		System.out.println("The model of the "+getBrand()+" is : "+getModel());		//using the getter function to print the info
		System.out.println("The year of the manufacturing is : "+getYear());		//using the getter function to print the info
		System.out.println("The color is : "+getColor());							//using the getter function to print the info
		System.out.println("The fuel type that the vehicle can use it : "+getFuelType());	//using the getter function to print the info
		System.out.println("The top speed : "+getTopSpeed());								//using the getter function to print the info
		System.out.println("The transmission type : "+getTransmissionType());				//using the getter function to print the info
		e1.printCarInfo(); //override function , the function in the composition object  
	}
	
}
