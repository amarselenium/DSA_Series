/***
 * Created By: AmareshRout
 * Date: 29/08/23
 * Project Name: NagarroTest
 */

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class First1D {

    public static void main(String[] args) {
        // int[][] arr = new int[3][];
       /* int[][] arr2d = new int[3][3];
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                arr2d[row][col]=input.nextInt();
            }

        }
        for(int[] arrnumber:arr2d)
            System.out.print(arrnumber+ " ");
        System.out.println();
        System.out.print(Arrays.toString(arr2d));
    }*/

        Scanner sc = new Scanner(System.in);
        int[][] arr2d = new int[3][3];
        arr2d[0][0] = 3;
        arr2d[0][1] = 4;
        arr2d[0][2] = 5;
        arr2d[1][0] = 6;
        arr2d[1][1] = 7;
        arr2d[1][2] = 8;
        arr2d[2][0] = 9;
        arr2d[2][1] = 10;
        arr2d[2][1] = 11;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2d[i][j] = sc.nextInt();


            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 3 ; i++) {
            System.out.println(Arrays.toString(arr2d[i]));

        }
    }
}
