import java.util.Scanner;

public class Main {
    private static String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        int di = 25;
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
            if (str.charAt(i) == ' ' || str.charAt(i) == '.' || str.charAt(i) == ',' || str.charAt(i) == '?' || str.charAt(i) == '!' || str.charAt(i) == '"' || str.charAt(i) == ':'
                    || str.charAt(i) == ';' || str.charAt(i) == '-' || str.charAt(i) == '_' || str.charAt(i) == '+' || str.charAt(i) == '(' || str.charAt(i) == ')' || str.charAt(i) == '#'
                    || str.charAt(i) == '$' || str.charAt(i) == '%' || str.charAt(i) == '&' || str.charAt(i) == '/' || str.charAt(i) == '[' || str.charAt(i) == ']' || str.charAt(i) == '^'
                    || str.charAt(i) == '°' || str.charAt(i) == '*' || str.charAt(i) == '~' || str.charAt(i) == '@' || str.charAt(i) == '´' || str.charAt(i) == '`' || str.charAt(i) == '='
                    || str.charAt(i) == '>' || str.charAt(i) == '<' || str.charAt(i) == '|' || str.charAt(i) == '1' || str.charAt(i) == '2' || str.charAt(i) == '3' || str.charAt(i) == '4'
                    || str.charAt(i) == '5' || str.charAt(i) == '6' || str.charAt(i) == '7' || str.charAt(i) == '8' || str.charAt(i) == '9' || str.charAt(i) == '0' || str.charAt(i) == '{'
                    || str.charAt(i) == '€' || str.charAt(i) == '}' || str.charAt(i) == '§') {
                letters[i] = str.charAt(i);
            } else if (alphabet.indexOf(str.charAt(i)) < 26) {
                for (int j = 0; j < num; j++) {
                    a++;
                    if(a>24){
                        a=0;
                    }
                    if(b>24){
                        b=0;
                    }
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
            } else {
                for (int j = 0; j < num; j++) {
                    a++;
                    if(a>50){
                        a=0;
                    }
                    if(di>50){
                        di=25;
                    }
                    if ((alphabet.indexOf(str.charAt(i)) + a) < 51) {
                        res = alphabet.indexOf(str.charAt(i)) + a;
                    } else {
                        res = di + 1;
                        di++;
                    }
                }
                letters[i] = alphabet.charAt(res);
                index1[i] = res;
                res = 0;
                di = 25;
                a = 0;

            }
        }
        for (int d = 0; d < str.length(); d++) {
            System.out.printf("%s ", letters[d]);
        }
        System.out.println(" \n");
        for (int i = 0; i < str.length(); i++) {
            if (letters[i] == ' ' || letters[i] == '.' || letters[i] == ',' || letters[i] == '?' || letters[i] == '!' || letters[i] == '"' || letters[i] == ':'
                    || letters[i] == ';' || letters[i] == '-' || letters[i] == '_' || letters[i] == '+' || letters[i] == '(' || letters[i] == ')' || letters[i] == '#'
                    || letters[i] == '$' || letters[i] == '%' || letters[i] == '&' || letters[i] == '/' || letters[i] == '[' || letters[i] == ']' || letters[i] == '^'
                    || letters[i] == '°' || letters[i] == '*' || letters[i] == '~' || letters[i] == '@' || letters[i] == '´' || letters[i] == '`' || letters[i] == '='
                    || letters[i] == '>' || letters[i] == '<' || letters[i] == '|' || letters[i] == '1' || letters[i] == '2' || letters[i] == '3' || letters[i] == '4'
                    || letters[i] == '5' || letters[i] == '6' || letters[i] == '7' || letters[i] == '8' || letters[i] == '9' || letters[i] == '0' || letters[i] == '{'
                    || letters[i] == '€' || letters[i] == '}' || letters[i] == '§') {
            } else if (alphabet.indexOf(letters[i]) < 26) {
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
            } else {
                for (int j = 0; j < num; j++) {
                    if (index1[i] - a > 26) {
                        res = index1[i] - a - 1;
                        a++;
                    } else {
                        c++;
                        res = 52 - c;
                    }
                }
                letters[i] = alphabet.charAt(res);
                res = 0;
                a = 0;
                c = 0;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.printf("%s ", letters[i]);
        }
    }
}
