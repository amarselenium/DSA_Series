/***
 * Created By: AmareshRout
 * Date: 06/09/23
 * Project Name: NagarroTest
 */

package Searching;

import java.util.Scanner;

public class SearchString {

    public static void main(String[] args) {
        System.out.println(SearchInString("Amaresh", 'r'));
    }

    static int SearchInString(String str, char target) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == target) {
                return i;

            }
        }
        return -1;
    }
}