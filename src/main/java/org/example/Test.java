/***
 * Created By: AmareshRout
 * Date: 22/05/23
 * Project Name: NagarroTest
 */

package org.example;

public class Test {
    public static void main(String[] args) {
        String str= "   Amaresh     Kumar    ROiut   ";
        int t = str.trim().length();
        System.out.println(t);
        str=str.trim();
        str.replaceAll("\\s","");
        System.out.println(str);

    }
}
