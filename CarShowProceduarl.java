package CarShowProceduarl;
import java.util.*;		//util library
public class CarShowProceduarl {
	public static void printEngineInfo(int ec,int hp)	//function to print the engine info and it takes arguments and doesn't return anything
	{
		System.out.println("Engine Capacity : "+ec);
		System.out.println("Engine Horse Power : "+hp);
	}
	
	public static void enterEngineInfo()	//function to get the engine info and it doesn't return anything and doesn't take attributes
	{
		int e1;
		int e2;
		Scanner reader2 = new Scanner(System.in);
		System.out.println("Please put the capacity of the engine : ");
		e1=reader2.nextInt();
		System.out.println("Please put the power of the engine : ");
		e2=reader2.nextInt();
		printEngineInfo(e1,e2);//call the function printEngineInfo with the attributes that the function need
	}
	public static void printVehicleInfo(String bb,String mm, String cc, int yy,int ts,int ft, String ttg)//function to print the vehicle info and it takes arguments and doesn't return anything
	{
		System.out.println("The brand : "+bb);
		System.out.println("The model of "+bb+" is : "+mm);
		System.out.println("Color : "+cc);
		System.out.println("Year : "+yy);
		System.out.println("Top Speed : "+ts);
		System.out.println("Fuel Type : "+ft);
		System.out.println("Type of transmission : "+ttg);
		
	}
	
	public static void enterVehicleInfo()	//function to get the vehicle info and it doesn't return anything and doesn't take attributes)
	{
		String b ;
		String c ;
		int t;
		int f;
		int d;
		String tg;
		String m ;
		
		System.out.println("Please choose the brand of the car that you are looking for : ");//getting the information from the user
		Scanner reader = new Scanner(System.in);
		b=reader.nextLine();
		System.out.println("Please put the model of the brand : ");
		m=reader.nextLine();
		System.out.println("Please choose the color: ");
		c=reader.nextLine();
		System.out.println("Please put the year : ");
		d=reader.nextInt();
		System.out.println("Please put the top speed : ");
		t=reader.nextInt();
		System.out.println("please put the fuel type : ");
		f=reader.nextInt();
		Scanner reader1 = new Scanner(System.in);
		System.out.println("please put the type of the gear : ");
		tg=reader1.nextLine();
		enterEngineInfo();						//call the function enterEngineInfo
		printVehicleInfo(b,m,c,d,t,f,tg);		//call the function printVehicleInfo with the attributes that the function need
		
	}
	public static void printCarInfo(int tt,String bb,String dt,double hh)//function to print the car info and it takes arguments and doesn't return anything
	{
		if(tt==1) {		//SUV car
			System.out.println("Class of car : SUV");
			System.out.println("Behavior of Suv car : "+bb);
			System.out.println("Drive Type of Suv car : "+dt);
			System.out.println("Heigth of Suv car : "+hh);
			
		
		}else {		//SEDAN car
			System.out.println("Class of car : Sedan");
			System.out.println("Behavior of SEDAN car : "+bb);
			System.out.println("Drive Type of SEDAN car : "+dt);
			System.out.println("Heigth of SEDAN car : "+hh);
			}
	}
	
	public static void enterCarInfo()	//function to get the car info and it doesn't return anything and doesn't take attributes
	{
		
		String [] Class = new String[2];	//an array to store the classes on it
		String behavior;
		String DriveType;
		double height=0;
		int temp;	//the answer of the class number
		Scanner reader1 = new Scanner(System.in);
		Class [0]="SUV";			//storing data in the index zero
		Class[1]= "Sedan";			//storing data in the index one
		System.out.println("please enter the number of the class car from the menu : ");
		System.out.println("1-"+Class[0]);		//print the array
		System.out.println("2-"+Class[1]);
		temp=reader1.nextInt();
		Scanner temp1 = new Scanner(System.in);		//scanner for the string
		System.out.println("Please enter the behavior : ");
		behavior = temp1.nextLine();
		
		System.out.println("Please enter the Drive type of the car : ");
		DriveType = temp1.nextLine();
		System.out.println("Please enter the height : ");
		height = reader1.nextDouble();
		enterVehicleInfo();		//call the function enterVehicleInfo
		printCarInfo(temp,behavior,DriveType,height);		//call the function printCarInfo with the attributes that the function need
		
		
		
		
	
		
		
		
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Welcome to the car show system , Please put the options of the car that you are looking for");
		boolean b1=true;	//boolean 
		char temp;	//declare a variable to receive from the user
		int t=0;	//like counter to count the number of cars
		
		
		while(b1==true) {	//loop while the boolean is true to repeat the process
		System.out.println("If you want to put the options of your car put y, If not put n");
		temp=read.next().charAt(0);
		if(temp=='y') {
			b1=true;
			enterCarInfo();	//call the function enterCarInfo
			t++;	//update the counter
			System.out.println("Car number : "+t);		//print the counter
		
		}else {
			b1=false;	//end the loop 
			System.out.println("Thanks for using the system");
			}

		}

}
}