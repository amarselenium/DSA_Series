/***
 * Created By: AmareshRout
 * Date: 31/05/23
 * Project Name: NagarroTest
 */

public class Day4 {

    public static void maximum(int[] arr) {
        int max = arr[0];
        for (int j = 1; j <= arr.length - 1; j++) {
            if (max < arr[j]) {
                max = arr[j];
            }
        }
        System.out.println(max);
    }


    public static void minimum(int[] arr) {
        int min = arr[0];
        for (int j = 1; j <= arr.length - 1; j++) {
            if (min >arr[j]) {
                min = arr[j];
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        int[] x= {10, 12, 5, 7, 9, 24, 71};
        maximum(x);
        minimum(x);
    }
}