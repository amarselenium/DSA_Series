/***
 * Created By: AmareshRout
 * Date: 04/01/24
 * Project Name: NagarroTest
 */

package MoreSorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-15, 8, 33, 1, 8, 24, 99, 169, 164, -78};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i ; j++) {

                if(arr[j]<arr[j-1])
                {
                    int temp= arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j]=temp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
