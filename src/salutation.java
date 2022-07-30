import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class salutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vehicles[][]= {};
		String cars[]=new String[100];
		String bikes[]= new String[100];
		String trucks[]= new String[100];
		int dataBaseLength=0;
		String input= "";
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your name?");
		String userName=scanner.nextLine();
		System.out.println("welcome to my coding journey "+userName);
		System.out.println("..............................................................");
		System.out.println( );
		while(true) {
		System.out.print("what type of vehicle do you seek?(cars,bikes or trucks)");
		String vehicleType=scanner.next();
		vehicleType.toLowerCase();
		if(vehicleType.equals("cars")||vehicleType.equals("bikes")||vehicleType.equals("trucks")) {
			switch (vehicleType) {
			case "cars":
				System.out.println("searching for cars");
				System.out.println(" ");
				System.out.println(Arrays.toString(cars));
				dataBaseLength=cars.length;
				System.out.println(" ");
				System.out.print("model");
				input=scanner.nextLine();
				cars[dataBaseLength]=input;
				System.out.println(" ");
				System.out.println("success");
				System.out.println(" ");
				System.out.println(Arrays.toString(cars));
				
				break;
			case "trucks":
				System.out.println("searching for trucks");
				System.out.println(" ");
				System.out.println(Arrays.toString(trucks));
				dataBaseLength=trucks.length;
				System.out.println(" ");
				System.out.print("model");
				input=scanner.nextLine();
				trucks[dataBaseLength]=input;
				System.out.println(" ");
				System.out.println("success");
				System.out.println(" ");
				System.out.println(Arrays.toString(trucks));
				break;
			case "bikes":
				System.out.println("searching for cars");
				System.out.println(" ");
				System.out.println(Arrays.toString(bikes));
				dataBaseLength=bikes.length;
				System.out.println(" ");
				System.out.print("model");
				input=scanner.nextLine();
				bikes[dataBaseLength]=input;
				System.out.println(" ");
				System.out.println("success");
				System.out.println(" ");
				System.out.println(Arrays.toString(bikes));
			break;
			default:
				break;
			}
			break;
		}
		else {
			System.out.println("input a valid type");
		}
	}
	}
}
