package CarShow;

public class Coupe extends vehicleClass {
	public Coupe(int NumOfDoors,int NumOfSeats)
	{
		super(NumOfDoors,NumOfSeats);
	}
	public void printCarInfo()
	{
		System.out.println("The number of the doors in the coupe car : "+getNumOfDoors());
		System.out.println("The number of the seats in the coupe car : "+getNumOfSeats());
		
	}

}
