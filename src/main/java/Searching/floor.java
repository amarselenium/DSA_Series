/***
 * Created By: AmareshRout
 * Date: 12/09/23
 * Project Name: NagarroTest
 */

package Searching;

public class floor {
    public static void main(String[] args) {
        int[] aortarr = {2, 3, 56, 89, 98, 101, 103, 106, 109, 111, 216, 228, 369};
        System.out.println(floor(aortarr,97));
    }

    public static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] == target) {
                return arr[mid];
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return arr[end];
    }
}
