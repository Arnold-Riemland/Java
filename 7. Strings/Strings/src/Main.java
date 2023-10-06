import java.util.Scanner;



public class Main {
    /**
     * Строки
     * Строка - последовательность символов.
     * Для работы со строками определён класс String.
     * Строка задаётся в двойных кавычках ""
     * Строки в Java неизменяемы (immutable), т.е. методы возвращают новую строку после изменения.
     * <p>
     * Методы класса String
     * length() - возвращает длину строки
     * toUpperCase(), toLowerCase() - изменяет регистр строки на верхний/нижний
     * charAt(<индекс>) - возвращает символ, находящийся в позиции <индекс>
     * indexOf(<символ/строка>, [start]) - возвращает позицию первого вхождения символа или подстроки в
     * строку. Необязательный параметр start определяет позицию начала поиска в строке.
     * Если ничего не найдено, возвращается -1.
     * lastIndexOf(...) - то же, что и indexOf(), только поиск идёт с конца строки.
     * repeat() -
     * replace() -
     * replaceAll() -
     * split() -
     * strip(), stripLeading(), stripTrailing(), trim() -
     * startsWith() -
     * substring() -
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String res = "";
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if ('a' == str.charAt(i)) {
                res += 'b';
                sum++;
            } else res += str.charAt(i);
        }
        System.out.println(res);
        System.out.println(sum);
    }
}