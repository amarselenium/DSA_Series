/***
 * Created By: AmareshRout
 * Date: 27/12/23
 * Project Name: NagarroTest
 */

package StringManupalation;

public class RevereseString {

    public static void main(String[] args) {
        String str= "I love programming very much";
        String strRev="";
        String[] splittedArray = str.split(" ");
        for (int i = splittedArray.length-1; i >=0 ; i--) {
            strRev=splittedArray[i]+" ";
            System.out.print(strRev);
        }


    }
}
