import java.util.Scanner;

public class QUESTION2 
{
  public static void main(String[]args)
  {
	  Scanner input =  new Scanner (System.in);
	  
	  int num1;
	  int num2;
	  int num3;
	  int num4;
	  
	  System.out.println("Enter the First Number");
	  num1 = input.nextInt();
	  
	  System.out.println("Enter the Second Number");
	  num2 = input.nextInt();
	  
	  System.out.println("Enter the Third Number");
	  num3 = input.nextInt();
	  
	  System.out.println("Enter the Fourth Number");
	  num4 = input.nextInt();
	  
      System.out.printf("The Output of Four Numbers is %d:", (num1+num2+num3)/num4);
      
  }
  }
