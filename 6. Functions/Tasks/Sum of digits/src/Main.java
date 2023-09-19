public class Main {


   static int SumOfDigits(int n){
       if(n<10)
           return n;
return n % 10 + SumOfDigits(n/10);
    }
    public static void main(String[] args)
    {
        System.out.printf("%d",SumOfDigits(123));
    }
}