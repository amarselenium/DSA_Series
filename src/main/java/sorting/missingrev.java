/***
 * Created By: AmareshRout
 * Date: 02/01/24
 * Project Name: NagarroTest
 */

package sorting;

import java.util.Arrays;

public class missingrev {
    public static void main(String[] args) {
        int[] arr = {3,2,5,4,7,1,0};
        int i = 0;
        while (i < arr.length) {
            int correctindex = arr[i]-1;
            if (arr[i]<arr.length && arr[correctindex] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[correctindex];
                arr[correctindex] = temp;
            }
            i++;

        }
        System.out.println(Arrays.toString(arr));
    }

}
