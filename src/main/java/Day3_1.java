import java.util.Arrays;

/***
 * Created By: AmareshRout
 * Date: 24/05/23
 * Project Name: NagarroTest
 */

public class Day3_1 {
    public static void main(String[] args) {
        String[] arr1 = {"Amaresh", "Amar", "Kumar", "Test", "India"};
        System.out.println(longestprefix(arr1));
    }


    public static String longestprefix(String[] arr) {
        Arrays.sort(arr);
        char[] firstCharArray = arr[1].toCharArray();
        char[] lastCharArray = arr[arr.length - 1].toCharArray();
        String commonPrefix = "";
        for (int i = 0; i <= arr.length - 1; i++) {
            int count = i;
            if (firstCharArray[i] != lastCharArray[i]) {
                return "No Prefix";

            } else {
                commonPrefix = commonPrefix + firstCharArray[count];
                count++;
            }
        }
        return commonPrefix;
    }
}
