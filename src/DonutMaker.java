/*  Program that calculates --the measurements of the 
 * donut and outputs the volume of squashed donut
 */
import java.util.Scanner; //import scanner class from java.util package

public class DonutMaker {

	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);  //allows to enter the value 

		double height, outerRadius, innerRadius; //in centimeter
		// Prompt User to Input
		System.out.println("Enter the height of the donut H:");
		height = input.nextDouble(); //load height variable 
		
		System.out.println("Enter the outer radius of the donut Ro:");
		outerRadius = input.nextDouble();
		
		System.out.println("Enter the inner radius of the donut Ri:");
		innerRadius = input.nextDouble();
		
		Donut donut= new Donut(height, 
				outerRadius, innerRadius); //Create Donut Object and Set the properties
		
		String kind; int number; double price;
		
		System.out.println("Enter number:");
		number=input.nextInt();
		
		System.out.println("Enter Kind:");
		kind=input.next();
		
		
		DonutK donut1= new DonutK(kind,number); 
		
		double volume = donut.CalculateVolume();
        System.out.printf("The volume of the squashed Donut is: %.2f cm^3%n" , volume);
		
		double tp = donut1.totalPrice();
        System.out.printf("The total Price of Donuts is: %.2f $ %n" , tp);
        
      


	}

}
