/***
 * Created By: AmareshRout
 * Date: 03/01/24
 * Project Name: NagarroTest
 */

package sorting;

import java.util.Arrays;

public class DuplicateNumberFinding {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

        int i = 0;
        while (i < arr.length) {
            int correctindex = arr[i] - 1;
            if (arr[correctindex] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[correctindex];
                arr[correctindex] = temp;
            } else {
                i++;
            }


        }
       for(int j =0;j<arr.length;j++)
       {
           int correctvalue= j+1;
           if(correctvalue!=arr[j])
           {
               System.out.println(arr[j]);
           }


        }
    }}

