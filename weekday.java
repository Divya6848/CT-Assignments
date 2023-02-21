import java.util.Scanner;
public class weekday{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number to display the weekday");
		int n=input.nextInt();
		switch(n)
		{
			case 1 :
			System.out.println("Sunday");
			break;
			case 2 :
			System.out.println("Monday");
			break;
			case 3 :
			System.out.println("Tuesday");
			break;
            case 4 :
			System.out.println("Wednesday");
			break;
			case 5 :
			System.out.println("Thursday");
			break;
			case 6 :
			System.out.println("Friday");
			break;
			case 7 :
			System.out.println("Satuarday");
			break;

			default :
			System.out.println("Enter a number in between 1-7");
		}
	}
}

