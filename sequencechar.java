public class sequencechar {
    public static void main(String[] args) {
        String str = "welcome to career tuner";
        CharSequence seq = "carrertun";
        boolean result = str.contains(seq);
        if (result) {
            System.out.println("The string contains the specified sequence of char values.");
        } else {
            System.out.println("The string does not contain the specified sequence of char values.");
        }
    }
}
