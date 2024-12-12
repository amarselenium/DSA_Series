/***
 * Created By: AmareshRout
 * Date: 16/09/23
 * Project Name: NagarroTest
 */

package Searching;

public class pivotInShotedArray {


    public static int pivotsortedArray(int[] arr) {

        int pivot = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (start < mid && arr[mid] < arr[mid - 1]) {
                pivot = mid - 1;
            }
            if (arr[mid] > arr[mid + 1] && end > mid) {
                pivot = mid;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return pivot;
    }


    public static int binarySearch(int[] arr, int target, int start, int end) {
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
    }


    public static void main(String[] args) {
        int[] arr = {19, 20, 1, 3, 4, 5, 8, 10, 14, 15, 16, 17, 18};
        int pivot = pivotsortedArray(arr);
        int start = 0;
        int end = arr.length - 1;
        int target = 17;
        if (pivot == target) {
            System.out.println(pivot);
        }
        if (arr[start] < pivot) {
            System.out.println(binarySearch(arr, target, 0, pivot-1));
        } else {
            System.out.println(binarySearch(arr, target, pivot+1, arr.length));
        }

    }
}

