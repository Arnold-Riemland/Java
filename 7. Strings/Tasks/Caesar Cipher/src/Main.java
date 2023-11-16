import java.util.Scanner;

public class Main {
    private static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        int c = 0;
        int a = 0;
        int b = -1;
        int num;
        String str;
        int res = 0;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        num = input.nextInt();
        int[] index1 = new int[str.length()];
        char[] letters = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < num; j++) {
                a++;
                if ((alphabet.indexOf(str.charAt(i)) + a) < 26) {
                    res = alphabet.indexOf(str.charAt(i)) + a;
                } else {
                    res = b + 1;
                    b++;
                }
            }
            letters[i] = alphabet.charAt(res);
            index1[i] = res;
            res = 0;
            b = -1;
            a = 0;
        }
        for (
                int i = 0; i < str.length(); i++) {
            System.out.printf("%s ", letters[i]);
        }
        System.out.println(" \n");
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < num; j++) {
                if (index1[i] - a > 0) {
                    res = index1[i] - a - 1;
                    a++;
                } else {
                    c++;
                    res = 26 - c;
                }
            }
            letters[i] = alphabet.charAt(res);
            res = 0;
            a = 0;
            c = 0;
        }
        for (
                int i = 0; i < str.length(); i++) {
            System.out.printf("%s ", letters[i]);
        }
    }
}