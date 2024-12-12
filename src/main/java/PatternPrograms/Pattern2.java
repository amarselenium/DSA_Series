/***
 * Created By: AmareshRout
 * Date: 25/08/23
 * Project Name: NagarroTest
 */

package PatternPrograms;

public class Pattern2 {

    public static void main(String[] args) {
        pattern(4);
    }

    public static void pattern(int n) {
        for (int row = 0; row <= 2 * n; row++) {
            int spacecount = row > n ? 2 * n - row : row;
            for (int space = 0; space <= n - spacecount; space++) {
                System.out.print(" ");
            }
            int colToPrint = row > n ? 2 * n - row : row;
            for (int col = 0; col <= colToPrint; col++) {
                System.out.print("*" + " ");
            }
            System.out.println("");

        }
    }
}
