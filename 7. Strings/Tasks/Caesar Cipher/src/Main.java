import java.util.Scanner;

public class Main {
    private static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        int c = 0;
        int key;
        String str;
        int res = 0;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        key = input.nextInt();
        int[] index1 = new int[str.length()];
        char[] letters = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            res = (alphabet.indexOf(str.charAt(i)) + key) % alphabet.length();
            letters[i] = alphabet.charAt(res);
            index1[i] = res;
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.printf("%s", letters[i]);
        }
        System.out.println(" \n");
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < key; j++) {
                if (index1[i] - j > 0) {
                    res = index1[i] - j - 1;
                } else {
                    c++;
                    res = 26 - c;
                }
            }
            letters[i] = alphabet.charAt(res);
            res = 0;
            c = 0;
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.printf("%s", letters[i]);
        }
    }
}