import java.util.*;
public class sumandaverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				System.out.println("input the 5 number:");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int sum = a + b + c + d + e;
		System.out.println("The sum of 5 number is:"+sum);
		int avg = sum / 5;
		System.out.println("The Average is:"+avg);
	}
}
