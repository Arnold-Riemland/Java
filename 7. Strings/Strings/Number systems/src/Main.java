import java.util.Scanner;

public class Main {
    private static String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strnum = input.nextLine();
        int system = input.nextInt();
        int newsystem = input.nextInt();
        System.out.println("Das Ergebnis ist: " + fromDec(toDec(strnum, system), newsystem));
    }

    public static int toDec(String num, int base) {
        int pos = 0;
        int res = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
            res += alphabet.indexOf(num.charAt(i)) * Math.pow(base, pos);
            pos++;
        }
        return res;
    }

    public static String fromDec(int num, int base) {
        String res = "";
        while (num != 0) {
            res = alphabet.charAt(num % base) + res;
            num /= base;
        }
        return res;
    }
}