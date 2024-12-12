/***
 * Created By: AmareshRout
 * Date: 17/09/23
 * Project Name: NagarroTest
 */

package Searching;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FIrstLastPosition {
    public static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static int[] firstandLast(int[] arr, int target) {
        int[] position = new int[2];
        if (binarysearch(arr, target) != -1) {
            position[0] = binarysearch(arr, target) - 1;
            position[1] = binarysearch(arr, target) + 1;
        } else {
            position[0] = -1;
            position[1] = -1;
        }
        return position;
    }

    public static void main(String[] args) {
        int arr[]={2, 3, 56, 89, 98, 101, 103, 106,109,111,216,228,369};
        //System.out.println(firstandLast(arr,216));
        System.out.println(Arrays.toString(firstandLast(arr,350)));

    }
}