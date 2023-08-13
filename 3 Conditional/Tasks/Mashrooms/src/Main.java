import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count;
        Scanner input = new Scanner(System.in);
        count = input.nextInt();
        if (count % 100 >= 11 && count % 100 <= 14) {
            System.out.println("Грибов");
        } else if (count % 10 == 1) {
            System.out.println("Гриб");
        } else if (count % 10 >= 2 && count % 10 <= 4) {
            System.out.println("Гриба");
        } else System.out.println("Грибов");

    }
}