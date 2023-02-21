import java.util.Scanner;

public class stringend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter another string: ");
        String suffix = input.nextLine();
        boolean result = str.endsWith(suffix);
        if (result) {
            System.out.println("The first string ends with the contents of the second string.");
        } else {
            System.out.println("The first string does not end with the contents of the second string.");
        }
    }
}


