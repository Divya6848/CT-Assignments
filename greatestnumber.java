import java.util.Scanner;
public class greatestNumber
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("To Check whether a Number Is Greater or not");
		System.out.println("Enter The First Number\n");
		int a=input.nextInt();
		System.out.println("Enter The Second Number\n");
		int b=input.nextInt();
		System.out.println("Enter The Third Number\n");
		int c=input.nextInt();
		if (a>b && a>c) 
		{
		  System.out.println(a +" is Greater");	
		}
		else if (b>a && b>c) {
		  System.out.println(b +" is Greater");
		}
		else
		{
			System.out.println(c +" is Greater");
		}
	}
}