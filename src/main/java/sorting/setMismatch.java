/***
 * Created By: AmareshRout
 * Date: 04/01/24
 * Project Name: NagarroTest
 */

package sorting;

import java.util.Arrays;

public class setMismatch {
    public static void main(String[] args) {
        int[] arr = {2,1,4,2,6,5};
        int i =0;
        while(i<arr.length)
        {
            int correctIndex= arr[i]-1;
            if(arr[i] != arr[correctIndex])
            {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;

            }
            else {
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1)
            {
                System.out.println(arr[j] +" "+ (j+1));
            }

        }
    }


}
