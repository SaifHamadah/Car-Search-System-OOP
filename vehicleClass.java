package CarShow;

public class vehicleClass {
	private int numOfDoors;
	private int numOfSeats;
	public vehicleClass(int numOfDoors, int numOfSeats) {
		setNumOfDoors(numOfDoors);
		setNumOfSeats(numOfSeats);
	}
	public int getNumOfDoors() {
		return numOfDoors;
	}
	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
	public int getNumOfSeats() {
		return numOfSeats;
	}
	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}
	public void printCarInfo()
	{
		System.out.println("The number of doors is : "+getNumOfDoors());
		System.out.println("The number of seats is : "+getNumOfSeats());
	}
	
}
