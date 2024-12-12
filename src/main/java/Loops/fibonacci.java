/***
 * Created By: AmareshRout
 * Date: 05/09/23
 * Project Name: NagarroTest
 */

package Loops;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = sc.nextInt();


        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= input) {

            int temp = a;
            a = a + b;
            b = temp;
            System.out.print(a + " ");
            count++;
        }
    }

}
