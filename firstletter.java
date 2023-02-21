public class firstletter {
    public static void main(String[] args) {
        String s = "java standard edition";
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
