// Дано четное число N(<0) и символы c1, c2
// Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов с1 и с2 начиная с с1
package Lesson2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        showLine(n);
    }

    private static void showLine(int n) {
        String line1 = "c1";
        String line2 = "c2";
        String result = "";

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result += line1;
            } else {
                result += line2;
            }
        }
        System.out.println(result);
    }
}
