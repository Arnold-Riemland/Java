import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word1 ="";
        int count;
        System.out.println("введите число от 100 до 999");
        Scanner input = new Scanner(System.in);
        count = input.nextInt();
        if (count >= 100 && count <= 999) {
            switch (count / 100) {
                case 1:
                    word1 +=" сто";
                    break;
                case 2:
                    word1+=" двести";
                    break;
                case 3:
                    word1 +=" триста";
                    break;
                case 4:
                    word1 +=" четыреста";
                    break;
                case 5:
                    word1 +=" пятьсот";
                    break;
                case 6:
                    word1 +=" шестьсот";
                    break;
                case 7:
                    word1 +=" семьсот";
                    break;
                case 8:
                    word1 +=" восемьсот";
                    break;
                case 9:
                    word1 +=" девятьсот";
                    break;
                default:
                    System.out.println("Errror");
                    break;
            }

            if ((count % 100) / 10 == 1) {
                switch ((count % 100)) {
                    case 10:
                        word1 +=" десять";
                        break;
                    case 11:
                        word1 +=" одиннадцать";
                        break;
                    case 12:
                        word1 +=" двенадцать";
                        break;
                    case 13:
                        word1 +=" тринадцать";
                        break;
                    case 14:
                        word1 +=" четырнадцать";
                        break;
                    case 15:
                        word1 +=" пятнадцать";
                        break;
                    case 16:
                        word1 +=" шестнадцать";
                        break;
                    case 17:
                        word1 +=" семнадцать";
                        break;
                    case 18:
                        word1 +=" восемнадцать";
                        break;
                    case 19:
                        word1 +=" девятнадцать";
                        break;
                }
                }
                if ((count % 100) / 10 !=0 && (count % 100) / 10 !=1) {
                    switch ((count % 100)/10) {
                        case 2:
                            word1 +=" двадцать";
                            break;
                        case 3:
                            word1 +=" тридцать";
                            break;
                        case 4:
                            word1 +=" сорок";
                            break;
                        case 5:
                            word1 +=" пятьдесят";
                            break;
                        case 6:
                            word1 +=" шестьдесят";
                            break;
                        case 7:
                            word1 +=" семьдесят";
                            break;
                        case 8:
                            word1 +=" восемьдесят";
                            break;
                        case 9:
                            word1 +=" девяносто";
                            break;
                    }
                    }
            if ((count % 100) / 10 == 0 || (count % 100) % 10 != 0 && (count % 100) / 10 != 1) {
                switch ((count % 100) % 10) {
                    case 1:
                        word1 +=" один";
                        break;
                    case 2:
                        word1 +=" двa";
                        break;
                    case 3:
                        word1 +=" три";
                        break;
                    case 4:
                        word1 +=" четыре";
                        break;
                    case 5:
                        word1 +=" пять";
                        break;
                    case 6:
                        word1 +=" шесть";
                        break;
                    case 7:
                        word1 +=" семь";
                        break;
                    case 8:
                        word1 +=" восемь";
                        break;
                    case 9:
                        word1 +=" девять";
                        break;
                }
            }
            System.out.println(word1);
        }
        else System.out.println("\u001B[31m" + "Error" + "\u001B[0m");
    }
}