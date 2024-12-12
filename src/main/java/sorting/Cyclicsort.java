/***
 * Created By: AmareshRout
 * Date: 23/10/23
 * Project Name: NagarroTest
 */

package sorting;

import java.util.Arrays;

public class Cyclicsort {


    public static void cyclicsort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;

            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1,0};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));


    }

}
