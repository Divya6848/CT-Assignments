import java.util.*;
public class product 
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("product_id:");
		int product_id = input.nextInt();
		System.out.println("product_name:");
		String product_name = input.next();
		System.out.println("product_price:");
		int product_price = input.nextInt();
		System.out.println("product_quantity:");
		int product_quantity = input.nextInt();
		System.out.println("product_category:");
		String product_category = input.next();
		System.out.println("product_brand:");
		String product_brand = input.next();
		System.out.println("product_id:" + product_id);
		System.out.println("product_name:" + product_name);
		System.out.println("product_price:" + product_price);
		System.out.println("product_quantity:" + product_quantity);
		System.out.println("product_category:" + product_category);
		System.out.println("product_brand:" + product_brand);
	}
}