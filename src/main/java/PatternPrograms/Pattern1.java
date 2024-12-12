/***
 * Created By: AmareshRout
 * Date: 25/08/23
 * Project Name: NagarroTest
 */

package PatternPrograms;

public class Pattern1 {

    public static void main(String[] args) {
        pattern(4);
    }

    public static void pattern(int n)
    {
        for (int row = 0; row <=n; row++) {
           for(int space =0;space<=n-row;space++)
           {
               System.out.print(" ");
           }
            for (int col=0;col<=row;col++)
            {
                System.out.print("*"+" ");
            }
            System.out.println("");

        }
    }
}
