/***
 * Created By: AmareshRout
 * Date: 23/10/23
 * Project Name: NagarroTest
 */

package sorting;

import java.util.Arrays;

public class Selectionsort {

    public static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr.length - i - 1;
            int max = getMax(arr, 0, last);
            if (arr[max] > arr[last]) {
                swap(arr, last, max);
            }

        }

    }


    public static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {

            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {-15, 8, 33, 1, 8, 24,99,169,164,-78};
        swap(arr,3,5);
        System.out.println(arr[3]);
        System.out.println(arr[5]);
        System.out.println(getMax(arr,0,arr.length-1));
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
