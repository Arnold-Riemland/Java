import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] words = str.split(" ");
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[max].length() < words[i].length()) {
                max = i;
            }
        }
        System.out.println(words[max].length());
        System.out.println(words[max]);
    }
}