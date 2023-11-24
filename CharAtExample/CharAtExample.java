public class CharAtExample {
    public static void main(String[] args) {
        String s1 = "Hello";

        // Check if the string is long enough before accessing a specific character
        if (s1.length() >= 6) {
            System.out.println(s1.charAt(5));
        } else {
            System.out.println("The string is not long enough.");
        }
    }
}