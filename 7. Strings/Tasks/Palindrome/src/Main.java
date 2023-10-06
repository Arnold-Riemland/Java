import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        if (isPalindrome(str)) {
            System.out.println("Yes");
        } else System.out.println("No");
    }

    public static boolean isPalindrome(String str) {
        int size = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(size - i - 1) != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
