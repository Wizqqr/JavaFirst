// Учитывая целое число n, верните разницу между произведением его цифр и суммой его цифр
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = getGetGetSumMinusMultiply(n);
        System.out.println("result: " + result);
    }

    private static int getGetGetSumMinusMultiply(int n) {
        int sum = 0;
        int multiply = 1;

        while(n != 0){
            sum += n % 10;
            multiply *= n % 10;
            n /= 10;
        }
        return multiply - sum;
    }
  }



//public class Main{
//    public static void main(String[] args) {
//        System.out.println("Hello World");
//    }
//}

//psvm - public static void main(String[] args)
//sout - System.out.println();