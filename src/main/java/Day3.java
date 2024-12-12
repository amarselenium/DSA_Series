import java.util.Arrays;

/***
 * Created By: AmareshRout
 * Date: 24/05/23
 * Project Name: NagarroTest
 */

public class Day3 {





    public static void main(String[] args) {
        String[] arr = {"Amaresh", "AmarY", "Amau", "Amatest"};
        Arrays.sort(arr);

        char[] firstCharArray = arr[1].toCharArray();
        char[] lastCharArray = arr[arr.length - 1].toCharArray();
        String commonPrefix = "";
        for (int i = 0; i <= arr.length - 1; i++) {
            int count = i;
            if (firstCharArray[i] != lastCharArray[i]) {
                System.out.println("No common prefix");
                break;
            }
            else {
                commonPrefix = commonPrefix + firstCharArray[count];
                count++;
            }
        }
        System.out.println(commonPrefix);
    }
}