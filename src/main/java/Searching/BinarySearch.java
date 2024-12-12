/***
 * Created By: AmareshRout
 * Date: 10/09/23
 * Project Name: NagarroTest
 */

package Searching;

public class BinarySearch {

    public static void main(String[] args) {
        int[] aortarr = {2, 3, 56, 89, 98, 101, 103, 106,109,111,216,228,369};
        System.out.println(binarysearch(aortarr, 216));


    }


    public static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end-start) / 2;
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
}