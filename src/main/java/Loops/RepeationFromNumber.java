/***
 * Created By: AmareshRout
 * Date: 05/09/23
 * Project Name: NagarroTest
 */

package Loops;

import java.util.Scanner;

public class RepeationFromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = sc.nextInt();
        int count = 0;
        while (input > 0) {
            int rem = input % 10;
            if (rem == 3) {
                count++;
            }
            input = input / 10;

        }
        System.out.println(count);
    }
}
