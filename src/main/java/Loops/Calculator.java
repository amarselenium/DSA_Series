/***
 * Created By: AmareshRout
 * Date: 05/09/23
 * Project Name: NagarroTest
 */

package Loops;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the operation");
        Character ch = sc.next().trim().charAt(0);
        if (ch == '+') {
            System.out.println(a + b);
        }
        if (ch == '-') {
            System.out.println(a - b);
        }
        if (ch == '*') {
            System.out.println(a * b);
        }
        if (ch == '/') {
            if (b != 0) {
                System.out.println(a / b);
            }
        }

    }
}
