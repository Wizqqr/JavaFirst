// Проверка на палиндром
package Lesson2;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        isPalindrom(str1);
    }

    private static void isPalindrom(String str1) {
        Boolean flag = true;

        int left = 0;
        int right = str1.length() -1;

        while (left < right) {
            if (str1.charAt(left) != str1.charAt(right)) {
                flag = false;
            }
            left++;
            right--;
        }
        System.out.println(flag);
    }
}
