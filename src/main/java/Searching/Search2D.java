/***
 * Created By: AmareshRout
 * Date: 06/09/23
 * Project Name: NagarroTest
 */

package Searching;

public class Search2D {

    public static void main(String[] args) {
        int[][] arr2d = {{1, 3, 4}, {4, 5, 2}, {6, 4, 9}};
        int target = 9;
        for (int row = 0; row <= arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                if (arr2d[row][col] == target) {
                    System.out.println(row + "" + col);
                }


            }

        }

    }
}
