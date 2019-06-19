import java.util.Scanner;

public class Project1 
{
	public static void main (String[] args)
	{
		int F=0;
		double C=0;
		
		System.out.println("Enter the temperature in degrees Fahrenheit");
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		F = keyboard.nextInt();
		
		C = (double) 5*(F-32)/9;
		
		System.out.println(F +" degrees Fahrenheit is " + C + " degrees Celsius.");
				
	}

}





