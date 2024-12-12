/***
 * Created By: AmareshRout
 * Date: 16/09/23
 * Project Name: NagarroTest
 */

package Searching;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetters {


    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char[] lettersOne = {'x','x','y','y'};
        System.out.println(samllestNumber(letters, 'c'));
    }

    public static char samllestNumber(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }

        }
        return arr[start % arr.length];
    }
}
