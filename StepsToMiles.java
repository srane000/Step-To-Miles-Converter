import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Represents the class steps to miles
 * which stores all the functions
 * that will convert a person's
 * steps to miles
 */
public class StepsToMiles {
	/**
	 * Private variables that include
	 * a persons name, height(in ft and inches)
	 */
	private String name; 
	private double feet;
	private double inches;
	/**
	 * Default constructor which
	 * indicate preset value for the instance
	 * variables if the user did not enter values
	 * for the variables
	 */
	public StepsToMiles () {
		name = null;
		feet = -1;
		inches = -1;

	}
	/**
	 * A non default constructor initializes
	 * variables by using constructor parameters
	 * @param name 
	 * @param feet
	 * @param inches
	 * @return 
	 */
	public StepsToMiles(String name, double feet, double inches) {
		//non default constructor to initialize the variable using constructor parameters
		this.name = name; //local variable only useful within the method you are in
		this.feet = feet; 
		this.inches = inches; 
	}
	/**
	 * function converts persons height in feet
	 * into inches
	 * @return inches
	 */
	public double height_inches() {
		double in = (feet*12) + (inches);
		return in;
	}
	/**
	 * function that finds a persons
	 * stride in inches
	 * @return length of stride
	 */
	public double strideLength_inches(){
		double stride = height_inches() * 0.413;
		return stride;
	}
	/**
	 * returns the number of miles given
	 * the amount of steps received
	 * @return miles
	 */
	public double miles(int steps) {
		double miles = ((strideLength_inches() * steps)) / (12*5280);
		return miles;
	}
	/**
	 * function that uses the Gregorian calendar
	 * to find todays date. We need to add an extra month
	 * since the month January starts as month 0
	 * @return todays date
	 */
	public String currDate() {
		Calendar calendar = new GregorianCalendar();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		month += 1;
		
		String year1 = String.valueOf(year);
		String month1 = String.valueOf(month);
		String day1 = String.valueOf(day);
		
		String todaysDate = month1+"/"+day1+"/"+year1;
		return todaysDate;
		
	}
	
	/**
	 * formats the integer steps into a string
	 * @param steps is a local variable
	 * @return the format of the string
	 */
	public String formatAsString(int steps) {
		String str_format = String.format("%,d", steps);
		return str_format;
	}
	
	
	
	/**
	 * Accessors and Mutators to change values for
	 * the private variables
	 */
	//Setters and getters
	public void setName(String name) {
		this.name = name; 
	}
	public String getName() {
		return this.name; 
	}
	public void setFeet(double feet){
		this.feet = feet;
	}
	public double getFeet() {
		return feet; 
	}
	public void setInches(double inches){
		this.inches = inches;
	}	
	public double getInches() {
		return inches; 
	}

}
