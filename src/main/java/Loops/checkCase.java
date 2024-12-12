/***
 * Created By: AmareshRout
 * Date: 05/09/23
 * Project Name: NagarroTest
 */

package Loops;

import java.util.Scanner;

public class checkCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Character testchar = input.trim().charAt(0);

        if (testchar >= 'a' && testchar <='z') {
            System.out.println("lower case");
        } else {
            System.out.println("upper case");
        }

    }

}
