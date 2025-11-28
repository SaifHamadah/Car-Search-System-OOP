package carShowSystem;
import java.util.ArrayList;		//The library of the array list
public class collectionOfCars {
	public ArrayList<Car> a1 = new ArrayList<>();		//an array list to store an objects from the class car in this array list(we don't know the size)
	public void addCar(Car c)		//add function to add objects 
	{
		a1.add(c);		//add the object c to the a1 array list
	}
}

