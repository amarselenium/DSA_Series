/***
 * Created By: AmareshRout
 * Date: 17/09/23
 * Project Name: NagarroTest
 */

package Searching;

public class Test {

    public int[] searchRange(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int[] position= new int[2];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
            position[0]= mid;
            position[1]=mid+1;
            return position;
            }
            if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

return position= new int[]{-1, -1};
    }
}