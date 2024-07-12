// Вход: aaabbbcdd
// Выход: abcd
package Lesson2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        clearLine(str1);
    }

    private static void clearLine(String str1) {
        String result = "";

        for (int i = 0; i < str1.length(); i++) {
            char currentChar = str1.charAt(i);

            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
        }
        System.out.println(result);
    }
}
