package CarShow;

public class luxuryCar {
	private String brand;
	private String color;
	private int topSpeed;
	private int engineCapacity;
	private int engineHorsePower;
	private int fuelType;
	private Transmission t1;
	private String a1;
	private String a2;
	private int a3;
	private static int noOfCars=0;
	public luxuryCar(String brand, String color, int topSpeed, int engineCapacity, int engineHorsePower, int fuelType, String a1, String a2, int a3) {
		setBrand(brand);
		setColor(color);
		setTopSpeed(topSpeed);
		setEngineCapacity(engineCapacity);
		setEngineHorsePower(engineHorsePower);
		setFuelType(fuelType);
		t1 = new Transmission(a1,a2,a3);
		noOfCars++;
		
	}
	
	
	public static int getNoOfCars() {
		return noOfCars;
	}


	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public int getEngineHorsePower() {
		return engineHorsePower;
	}
	public void setEngineHorsePower(int engineHorsePower) {
		this.engineHorsePower = engineHorsePower;
	}
	public int getFuelType() {
		return fuelType;
	}
	public void setFuelType(int fuelType) {
		this.fuelType = fuelType;
	}
	
	public void printCarInfo()
	{
		System.out.println("The brand is : "+getBrand());
		System.out.println("The Color is : "+getColor());
		System.out.println("The top speed is : "+getTopSpeed());
		System.out.println("The engine capacity is : "+getEngineCapacity());
		System.out.println("The engine horse power is : "+getEngineHorsePower());
		System.out.println("The fuel type : "+getFuelType());
		t1.printTransmissionInfo();
		
	}
	
	
}
