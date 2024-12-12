/***
 * Created By: AmareshRout
 * Date: 23/10/23
 * Project Name: NagarroTest
 */

package sorting;

import java.util.Arrays;

public class findTheMissingNumner {
    public static void main(String[] args) {
        int[] arr = {3,2,5,4,7,1,0};
        int i= 0;
        while(i<arr.length)
        {
            int correctIndex = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correctIndex])
            {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;

            }else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
