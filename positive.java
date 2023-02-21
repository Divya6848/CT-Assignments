import java.util.Scanner;
 public class Positive
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number to check Whether it is positive or negative\n");
		int a=input.nextInt();
		if (a>=0) 
		{
		    System.out.println("Your Number is Positive");	
		}
		else
		{
            System.out.println("Your Number is Negative");
		}
	}
}