import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);


        int array[] = new int[7];
        for (int j=0;j< array.length;j++) {
            array[j] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                System.out.printf("%d ", array[i]);
            }

        }
    }
}