import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int size = str.length();
        // int position=0;
       /* for (int i = 0; i < str.length(); i++) {
            position++;
            if (str.charAt(size - position) != str.charAt(i)) {
                System.out.println("No");
            }
        }
       System.out.println("Yes");

        */
        if (Palindrom(size, str)) {
            System.out.println("Yes");
        } else System.out.println("No");

    }

    public static boolean Palindrom(int size, String str) {
        int position = 0;
        for (int i = 0; i < str.length(); i++) {
            position++;
            if (str.charAt(size - position) != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
