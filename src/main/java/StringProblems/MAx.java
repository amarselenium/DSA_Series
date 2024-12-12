/***
 * Created By: AmareshRout
 * Date: 04/01/24
 * Project Name: NagarroTest
 */

package StringProblems;

import java.util.Arrays;

public class MAx {
    public static void main(String[] args) {
        int[] arr = {8, 6, 2, 512, 1, 9, 165,923};
        int max = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }}

