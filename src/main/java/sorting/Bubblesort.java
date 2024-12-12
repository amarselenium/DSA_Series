/***
 * Created By: AmareshRout
 * Date: 23/10/23
 * Project Name: NagarroTest
 */

package sorting;

import java.util.Arrays;

public class Bubblesort {

    public static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-15, 8, 33, 1, 8, 24, 99, 169, 164, -78};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}



