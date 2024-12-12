import java.util.LinkedHashMap;
import java.util.Map;

/***
 * Created By: AmareshRout
 * Date: 23/05/23
 * Project Name: NagarroTest
 */

public class Day2_1 {
    public static void main(String[] args) {
        checkDuplicate();
    }

    public static void checkDuplicate() {
        int a[] = {11, 12, 11, 11, 2, 5, 7, 9, 34, 76, 87};
        Map<Integer, Integer> mp = new LinkedHashMap<Integer, Integer>();
        for (Integer i : a) {
            if (mp.containsKey(i)) {
                mp.put(i, mp.get(i) + 1);
            } else {
                mp.put(i, 1);
            }

        }
        for (Map.Entry<Integer, Integer> entries : mp.entrySet()) {
            boolean value = false;
            System.out.println(entries.getKey() + "=" + (value = entries.getValue() > 1 ? true : false));

        }
    }
}
