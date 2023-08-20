import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int sum=1001;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int array[] = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]>0 && i+1<= array.length){
              sum=Math.min(sum,array[i]);

            }

        }System.out.printf("%d ", sum);
    }
}