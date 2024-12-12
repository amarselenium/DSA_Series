/***
 * Created By: AmareshRout
 * Date: 23/05/23
 * Project Name: NagarroTest
 */

package org.example;

public class Day2 {
    public static void main(String[] args) {
        primeNumber(29);
    }

    public static void primeNumber(int range) {
        for (int i = 2; i <= range; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                System.out.println(i);
            }
        }

    }
}
