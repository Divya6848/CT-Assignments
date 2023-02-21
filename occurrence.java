public class occurrence {
    public static void main(String[] args) {
        String str = "bvrit college";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '1') {
                count++;
                if (count == 2) {
                    System.out.print(Character.toUpperCase(c));
                } else {
                    System.out.print(c);
                }
            } else {
                System.out.print(c);
            }
        }
    }
}
