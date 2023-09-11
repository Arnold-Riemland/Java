import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        int x;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int[] array = new int[number];
        if (number != sum) {
            for (int i = 0; i < number; i++) {
                array[i] = input.nextInt();
                sum++;
            }
        }
        x = input.nextInt();
        for (int j = 0; j < x; j++) {
            int a = 1;
            int nextElement = 0;
            int saveNextElement=0;
            int v;
            for (int i = 0; i < array.length ; i++) {
                if (i < array.length-1) {
                    if (array[a] == array[i]) {
                        a++;
                        nextElement++;
                        v = array[nextElement];
                        array[a] = saveNextElement;
                        saveNextElement = v;
                    }else{
                        nextElement++;
                        saveNextElement= array[nextElement];
                    array[i + 1] = array[i];
                   }
                } else {
                    array[0] = saveNextElement;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}