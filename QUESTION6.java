
	import java.util.Scanner; 
	public class QUESTION6
	{
	 public static void main(String[] args)
	 {
	 Scanner input=new Scanner (System.in); 
	
	 int num1=2, num2=4, bigger=0; 
	 
	 System.out.printf("Enter First Number: ");
	 num1=input.nextInt(); 
	 
	 System.out.printf("Enter Second Number: ");
	 num2=input.nextInt(); 
	 
	 if (num1>num2)
	 {
	 bigger=num1;
	 System.out.printf("%d Is Larger", bigger);
	 }
	 else if (num1<num2)
	 {
	 bigger=num2;
	 System.out.printf("%d Is Larger", bigger);
	 }
	 else
	 { 
	 System.out.printf("The numbers are equal");
	 } 
	 }
	}

   

