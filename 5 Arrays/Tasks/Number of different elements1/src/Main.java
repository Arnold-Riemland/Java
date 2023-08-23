import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = input.nextInt();
        int array[] = new int[count];
        for (int j = 0; j < array.length; j++) {
            array[j] = input.nextInt();
        }
        for (int i = 0; i < 1; i++) {
            for (int d = 0; d < array.length - 1; d++) {
                if (array[d] != array[d + 1]) {
                    sum++;
                }
            }
        }
        System.out.println(sum + 1);
    }
}