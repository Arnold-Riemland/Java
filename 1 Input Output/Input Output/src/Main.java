import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ввод информации
        int num1, num2;
        /*
            Scanner - класс для чтения информции
            System.in - поток, из которого информация поступает (клавиатура)
         */
        Scanner input = new Scanner(System.in);

        num1 = input.nextInt();
        num2 = input.nextInt();

        // Форматированный вывод
        System.out.printf("N1 = %d, N2 = %d", num1, num2);
    }
}