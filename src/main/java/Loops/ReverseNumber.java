/***
 * Created By: AmareshRout
 * Date: 05/09/23
 * Project Name: NagarroTest
 */

package Loops;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = sc.nextInt();
        int reverse = 0;
        while(input>0)
        {
            int rem = input%10;
            reverse = reverse*10+rem;
            input =input/10;
        }

        System.out.println(reverse);
        
    }
    
}
