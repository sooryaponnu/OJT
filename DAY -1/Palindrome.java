public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome");
        String value = "amma";
        String rev = new StringBuilder(value)
                .reverse().toString();
        if (value.equals(rev)) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }


}



