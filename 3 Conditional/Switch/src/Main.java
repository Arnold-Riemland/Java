import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         *  switch(<значение>) {
         *      case <значение 1>:
         *          <операторы>
         *          break;
         *      case <значение 2>:
         *          <операторы>
         *          break;
         *      ...
         *      default:
         *          <операторы>
         *          break;
         *  }
         *
         *  Конструкция, заменяющая if и используемая, если необходимо множество сравнений.
         *  break - может отсутствовать, но будет каскадное погружение во все последующие case.
         *  default - если не было совпадения ни с одним case, то выполняются данные операторы
         */

        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}