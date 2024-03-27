import java.util.Scanner;

public class Main {
    private static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    static String Encode(String str, int key) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            int res = (alphabet.indexOf(str.charAt(i)) + key) % alphabet.length();
            str1 += alphabet.charAt(res);
        }
        return str1;
    }

    static String Decode(String str, int key) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            int res = (alphabet.indexOf(str.charAt(i)) + alphabet.length() - key % alphabet.length()) % alphabet.length();
            str1 += alphabet.charAt(res);
        }
        return str1;
    }

    public static void main(String[] args) {
        int key;
        String str;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        key = input.nextInt();

        str = Encode(str, key);
        System.out.printf("%s", str);

        System.out.println(" \n");

        str = Decode(str, key);
        System.out.printf("%s", str);


    }
}