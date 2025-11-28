package CarShow;

public class Bmw extends luxuryCar {
	private String model;
	
	

	public Bmw(String brand, String color, int topSpeed, int engineCapacity, int engineHorsePower, int fuelType,
			String model, String a1, String a2, int a3) {
		super(brand, color, topSpeed, engineCapacity, engineHorsePower, fuelType, a1, a2, a3);
		setModel(model);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void printCarInfo()
	{
		super.printCarInfo();
		System.out.println("The model of Bmw is : "+getModel());
	}
}
