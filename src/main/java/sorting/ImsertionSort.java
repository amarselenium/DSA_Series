/***
 * Created By: AmareshRout
 * Date: 23/10/23
 * Project Name: NagarroTest
 */

package sorting;

import java.util.Arrays;

public class ImsertionSort {

    public static void main(String[] args) {
        int[] arr = {-15, 8, 33, 1, 8, 24, 99, 169, 164, -78};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j>0 ; j--) {
                if(arr[j]<arr[j-1])
                {
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}