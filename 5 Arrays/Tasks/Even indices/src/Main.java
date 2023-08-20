import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[10];
        for (int j = 0; j < array.length; j++) {
            array[j] = input.nextInt();
        }
        // i = i + 2  =>  i += 2
        for (int i = 0; i < array.length; i += 2) {
            System.out.printf("%d ", array[i]);
        }
    }
}