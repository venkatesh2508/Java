import java.util.*;
public class QUESTION3
{
 
	public static void main(String[]args)
	{
	  Scanner input = new Scanner(System.in);
	  double celsius;
	  double tempInFahrenheit = 0.0;
	  
	  celsius = (tempInFahrenheit - 32.0) * 5.0/9.0;
	  System.out.println("Enter the Fahrenheit Value");
	  tempInFahrenheit = input.nextDouble();
	  
	  
	 System.out.printf("The Celsisous of %12.2f is %2.2f",tempInFahrenheit,celsius);
	 
	}
}
