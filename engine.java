package carShowSystem;

public class engine {
	private int engineSize;
	private int engineHorsePower;
	
	
	
	public engine(int engineSize, int engineHorsePower) {		//constructor
		setEngineSize(engineSize);					//call the setter function
		setEngineHorsePower(engineHorsePower);		//call the setter function
	}
	public int getEngineSize() {		//getter function
		return engineSize;
	}
	public void setEngineSize(int engineSize) {		//setter function
		this.engineSize = engineSize;
	}
	public int getEngineHorsePower() {		//getter function
		return engineHorsePower;
	}
	public void setEngineHorsePower(int engineHorsePower) {			//setter function
		this.engineHorsePower = engineHorsePower;
	}
	public void printCarInfo()		//print function to print this class attributes
	{
		System.out.println("The engine size is : "+getEngineSize());				//using the getter function to print the info
		System.out.println("The engine horse power is : "+getEngineHorsePower());	//using the getter function to print the info
	}
	
	
}
