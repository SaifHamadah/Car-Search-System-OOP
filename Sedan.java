package CarShow;

public class Sedan extends vehicleClass {
	public Sedan(int NumOfDoors,int NumOfSeats)
	{
		super(NumOfDoors,NumOfSeats);
	}
	public void printCarInfo()
	{
		System.out.println("The number of the doors in the sedan car : "+getNumOfDoors());
		System.out.println("The number of the seats in the sedan car : "+getNumOfSeats());
		
	}

}
