package CarShow;

public class Transmission {
	private String type;
	private String manufacter;
	private int speeds;
	public Transmission(String type, String manufacter, int speeds) {
		setType(type);
		setManufacter(manufacter);
		setSpeeds(speeds);
	}
	
	public int getSpeeds() {
		return speeds;
	}

	public void setSpeeds(int speeds) {
		this.speeds = speeds;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getManufacter() {
		return manufacter;
	}
	public void setManufacter(String manufacter) {
		this.manufacter = manufacter;
	}
	public void printTransmissionInfo()
	{
		System.out.println("The type of the gear is : "+getType());
		System.out.println("The manufacter name of the transmission is : "+getManufacter());
		System.out.println("The speeds of the "+getManufacter()+" transmission are : "+getSpeeds());
	}
	

}
