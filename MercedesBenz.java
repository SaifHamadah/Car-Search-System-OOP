package CarShow;

public class MercedesBenz extends luxuryCar {
	private String model;
	

	public MercedesBenz(String brand, String color, int topSpeed, int engineCapacity, int engineHorsePower,
			int fuelType, String model, String a1, String a2, int a3) {
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
		System.out.println("The model of Mercedes-Benz is : "+getModel());
	}
}
