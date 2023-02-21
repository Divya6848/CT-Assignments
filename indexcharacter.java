import java.util.Scanner;
public class careertuner{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a string:");
		String str=input.nextLine();
		System.out.print("Enter an index:");
		int index=input.nextInt();
		if(index >=0 &&index<str.length())
		{
			System.out.println("The character at the given index is:"+str.charAt(index));
		}
		else
		{
			System.out.println("The given index is out of range.");
		}
	}
}
