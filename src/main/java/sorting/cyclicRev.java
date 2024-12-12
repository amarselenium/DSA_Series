/***
 * Created By: AmareshRout
 * Date: 02/01/24
 * Project Name: NagarroTest
 */

package sorting;

import java.util.Arrays;

public class cyclicRev {

    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1, 0, 8};
        cyclicsorting(arr);

    }


    public static void cyclicsorting(int[] arr) {


        int i = 0;
        while (i < arr.length) {
            int correctindex = arr[i];
            if (arr[i] < arr.length && arr[correctindex] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[correctindex];
                arr[correctindex] = temp;
            }
            i++;

        }
        System.out.println(Arrays.toString(arr));
    }
}
