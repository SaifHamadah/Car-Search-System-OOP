package carShowSystem;

public class carShowSystem {

	public static void main(String[] args) {
		
		
		Car bmw = new Car("bmw","m5",2022,"black","95",300,"Manual",2000,300,"Street car","rear wheel",1.95);	//creating an object
		bmw.printCarInfo();	//print function
		//bmw.setColor("red");
		System.out.println("Car number : "+Car.getCounter());		//print the counter using the class name and the getter function
		System.out.println("==============================================================");
		Car Mercedes = new SUV("Mercedes-Benz","GLE300",2020,"White","95 or 90",270,"Automatic",3500,450,"Offroad car","4-WD",2.10);//creating an object
		Mercedes.printCarInfo();									//print function
		System.out.println("Car number : "+Car.getCounter());		//print the counter using the class name and the getter function
		System.out.println("==============================================================");
		Car Lexus = new sedan("Lexus","es250h",2016,"Red","90",190,"CVT",2500,200,"Street car","Front wheel",1.9);	//creating an object
		Lexus.printCarInfo();										//print function
		System.out.println("Car number : "+Car.getCounter());		//print the counter using the class name and the getter function
		System.out.println("==============================================================");
		collectionOfCars c1 = new collectionOfCars();	//creating an object from the array list function
		c1.addCar(bmw);			//adding the objects to the array list
		c1.addCar(Mercedes);	//adding the objects to the array list
		c1.addCar(Lexus);		//adding the objects to the array list
		for(int i=0;i<c1.a1.size();i++) {		//loop to access the objects in the array list
		
			Car temp = c1.a1.get(i);	//storing the object in the index i in the Car object
			temp.printCarInfo();		//print function for the object
			System.out.println("==============================================================");
		}
	}

}
