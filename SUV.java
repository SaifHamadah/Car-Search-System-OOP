package carShowSystem;

public class SUV extends Car{
	private String b;
	private String d;
	private double h;
	public SUV(String brand, String model, int year, String color, String fuelType, int topSpeed,
			String transmissionType,int engineS,int engineH, String b, String d, double h) {		//constructor
		super(brand, model, year, color, fuelType, topSpeed, transmissionType, engineS,engineH, b, d, h);	//parent class constructor
		setB(b);		//call the setter function
		setD(d);		//call the setter function
		setH(h);		//call the setter function
	}
	public String getB() {		//getter function
		return b;
	}
	public void setB(String b) {		//setter function
		this.b = b;
	}
	public String getD() {		//getter function
		return d;
	}
	public void setD(String d) {		//setter function
		this.d = d;
	}
	public double getH() {		//getter function
		return h;
	}
	public void setH(double h) {		//setter function
		this.h = h;
	}
	public void printCarInfo()		//print function to print this class attributes 
	{
		super.printClassInfo();		//override function , the function in the super class
		System.out.println("The abilities of the SUV car : "+getB());		//using the getter function to print the info
		System.out.println("The drive type : "+getD());						//using the getter function to print the info
		System.out.println("The height of the car : "+getH());				//using the getter function to print the info
		
		
	}
}
