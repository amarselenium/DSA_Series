/***
 * Created By: AmareshRout
 * Date: 10/09/23
 * Project Name: NagarroTest
 */

package Searching;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        int[] ascending = {2, 3, 56, 89, 98, 101, 103, 106, 109, 111, 216, 228, 369};
        int[] desceding = {369, 228, 216, 111, 109, 106, 103, 102, 101, 98, 89, 56, 3, 2};
        System.out.println(agnosticbinarysearch(desceding, 101));
    }

    public static int agnosticbinarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] < arr[end]) {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == target) {
                    return mid;
                }
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return -1;
        } else {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == target) {
                    return mid;
                }
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return -1;
        }
    }

}

