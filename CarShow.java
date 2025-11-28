package CarShow;
import java.util.*;
public class CarShow {

	public static void main(String[] args) {	
	Bmw m1 = new Bmw("Bmw","Black",300,4000,500,95,"M5","Manual Transmission","ZF",8);	
	vehicleClass c1 = new Coupe(2,2);
	m1.printCarInfo();
	c1.printCarInfo();
	System.out.println("Car number : "+luxuryCar.getNoOfCars());
	System.out.println("==================================================================");
	MercedesBenz b1 = new MercedesBenz("Mercedes-Benz","Red",270,3500,300,95,"GLC200","Automatic Transmission","ZF",10);
	vehicleClass c2 = new SUV(5,5);
	b1.printCarInfo();
	c2.printCarInfo();
	System.out.println("Car number : "+luxuryCar.getNoOfCars());
	System.out.println("==================================================================");
	Lexus l1 = new Lexus("Lexus","Silver",190,2400,187,95,"Hs200h","Automatic Transmission","CVT Transmission",1);
	vehicleClass c3 = new Sedan(4,5);
	l1.printCarInfo();
	c3.printCarInfo();
	System.out.println("Car number : "+luxuryCar.getNoOfCars());
	System.out.println("==================================================================");
	collectionOfCars a1 = new collectionOfCars();
	a1.Add(m1);
	a1.addVehicleClass(c1);
	
	a1.Add(b1);
	a1.addVehicleClass(c2);
	
	a1.Add(l1);
	a1.addVehicleClass(c3);
	
	luxuryCar m2 = a1.coc.get(0);
	vehicleClass v1 = a1.typ.get(0);
	m2.printCarInfo();
	v1.printCarInfo();
	System.out.println("==================================================================");
	
	luxuryCar b2 = a1.coc.get(1);
	vehicleClass v2 = a1.typ.get(1);
	m2.printCarInfo();
	v1.printCarInfo();
	System.out.println("==================================================================");
	
	luxuryCar l2 = a1.coc.get(2);
	vehicleClass v3 = a1.typ.get(2);
	m2.printCarInfo();
	v1.printCarInfo();
	System.out.println("==================================================================");


	}

}
