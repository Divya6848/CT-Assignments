public class convertstring {
    public static void main(String[] args) {
        String str = "b.v.raju college";
        int index = str.indexOf("raju");
        if (index != -1) {
            String firstPart = str.substring(0, index);
            String secondPart = str.substring(index, index + 4).toUpperCase();
            String thirdPart = str.substring(index + 4);
            System.out.println(firstPart + secondPart + thirdPart);
        } else {
            System.out.println(str);
        }
    }
}


