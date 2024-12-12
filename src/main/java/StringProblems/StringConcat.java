/***
 * Created By: AmareshRout
 * Date: 12/9/24
 * Project Name: NagarroTest
 */

package StringProblems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringConcat {
    public static void main(String[] args) {
        String name = "aaabssbkksksbMMa";
         char[] chars = name.toCharArray();
        HashMap<Character,Integer> countofLetters = new LinkedHashMap<>();
        for (Character ch: chars) {
            if (countofLetters.containsKey(ch))
            {
                countofLetters.get(ch);
                countofLetters.put(ch,countofLetters.get(ch)+1);
            }
            else {
                countofLetters.put(ch,0);
            }

        }
        for (Map.Entry<Character,Integer> entry: countofLetters.entrySet()) {
            Character ch1=entry.getKey();
            Integer i1= entry.getValue();
            System.out.print(ch1);
            System.out.print(i1);

            
        }
    }
}
