import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, scan;
        int place = 1;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int array[] = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();

        }
        System.out.println("place");
        scan = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] < 200) {
                if (array[i] >= scan) {
                    place++;
                }
            }
        }
        System.out.println(place);

    }
}