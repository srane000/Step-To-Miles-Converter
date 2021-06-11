import java.util.Scanner;
import java.lang.System;

public class TestStepsToMiles {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //creates user input
		
		System.out.printf("%26s", "Enter Name: "); 
		
		StepsToMiles p1 = new StepsToMiles();//creates an instance of the default constructor 
		String p2_name = input.nextLine();//puts the user input into a string variable
		
		
		System.out.printf("%25s", "Enter Height (ft and in): ");
		String p2_height = input.nextLine();//puts the height into a string variable
		
		String[] num = p2_height.split(" ");//puts a white space in between two inputs

		double p2_feet = Double.parseDouble(num[0]);//separating feet and inches
		double p2_inches = Double.parseDouble(num[1]);
		
		//Closes the scanner class
		input.close();
		
		//Prints out the date
		System.out.printf("%n");
		System.out.printf("%26s%s%n", "Todays Date: ", p1.currDate());
		System.out.printf("%n");
		
		//person 1
		//Sets value to the private variables by calling the mutators
		p1.setName("Jane Doe");
		p1.setFeet(5.00);
		p1.setInches(4.50);
		
		//format the feet and inches into a string format
		//This allows the formatted string to be called rather having to write the whole things in printf
		String p1_ftStrformat = String.format("%.2f", p1.getFeet());
		String p1_inStrformat = String.format("%.2f", p1.getInches());
		String person1_height = p1_ftStrformat + "' " + p1_inStrformat + "\"";
		
		//The rest of the printf statements outputs certain methods we want
		System.out.printf("%26s%s%n", "Name: ", p1.getName());
		System.out.printf("%26s%s%n", "Height: ", person1_height);
		System.out.printf("%26s%.2f%n","Stride: ", p1.strideLength_inches());
		System.out.printf("%26s%s%n","Steps: ", p1.formatAsString(12345));
		System.out.printf("%26s%.2f %s%n", "Walk: ", p1.miles(12345), "miles");
		
		StepsToMiles p2 = new StepsToMiles(p2_name, p2_feet, p2_inches);//creates second instance for parameterized constructor
		//Using the parameterized constructor we can get access to the value we need without calling mutators
		
		//format the ft and in using object 2
		//Values were received from user input
		String p2_ftStrFormat = String.format("%.2f", p2.getFeet());
		String p2_inStrFormat = String.format("%.2f", p2.getInches());
		String person2_height = p2_ftStrFormat + "'" + p2_inStrFormat + "\"";
		
		//prints all the values needed utilizing the print f function
		System.out.printf("%n");
		System.out.printf("%26s%s%n", "Name: ", p2.getName());
		System.out.printf("%26s%s%n", "Height: ", person2_height);
		System.out.printf("%26s%.2f%n","Stride: ", p2.strideLength_inches());
		System.out.printf("%26s%s%n", "Steps: ", p2.formatAsString(1000));
		System.out.printf("%26s%.2f %s%n", "Walk: ", p2.miles(1000), "miles");
		}
}
