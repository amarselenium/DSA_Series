/***
 * Created By: AmareshRout
 * Date: 06/09/23
 * Project Name: NagarroTest
 */

package Searching;

public class EvenDigit {

    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7986};
        for (int num : arr) {
            int count = 0;
            int num1 = num;
            while (num > 0) {
                num = num / 10;
                count++;

            }
            if (count % 2 == 0) {
                System.out.println(num1);
            }
        }

    }
}
