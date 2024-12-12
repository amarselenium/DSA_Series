/***
 * Created By: AmareshRout
 * Date: 29/08/23
 * Project Name: NagarroTest
 */

package Arrays;

import java.util.Scanner;

public class First2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr2d = new int[3][];
        arr2d[0]= new int[3];
        arr2d[1]= new int[2];
        arr2d[2]= new int[4];


        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                arr2d[i][j] = sc.nextInt();
            }

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print(arr2d[i][j] + "  ");

            }
            System.out.println();

        }

    }
}
