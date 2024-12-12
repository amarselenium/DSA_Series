/***
 * Created By: AmareshRout
 * Date: 06/09/23
 * Project Name: NagarroTest
 */

package Searching;

import java.util.Arrays;

public class MaximumWealth {
    public static int welathCalculation(int[][] arr) {
        int[] wealth = new int[arr.length];
        int max = wealth[0];
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum = sum + arr[row][col];
                wealth[row] = sum;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }


    /*public static int maximumNumber(int[] ar) {
        int max = ar[0];
        for (int y : ar) {
            if (y > max) {
                max = y;
            }
        }

        return max;
    }
*/
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 4}, {4, 6, 9}, {9, 5, 45}};
        // welathCalculation(arr);
        System.out.println(welathCalculation(arr));
    }
}

