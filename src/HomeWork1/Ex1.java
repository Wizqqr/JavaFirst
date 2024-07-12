package HomeWork1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        toTriangle(n);
    }

    private static void toTriangle(int n) {
        int triangleNum = 0;
        for(int i = 1; i <= n; i++){
            triangleNum += i;
        }
        System.out.println("Triangle number: " + triangleNum);
    }
}
