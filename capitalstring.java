
public class capitalstring {
    public static void main(String[] args) {
        String str = "Print the Capital Letters from String";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                System.out.print(c + " ");
            }
        }
    
}
