/***
 * Created By: AmareshRout
 * Date: 08/10/24
 * Project Name: NagarroTest
 */

package Oct2024;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetKeySet {

    public static void main(String[] args) {
        Set<Integer> myset = new HashSet<>();
        myset.add(12);
        Map<Integer,String> mymap= new HashMap<>();
        System.out.println(myset);
        mymap.put(989,"Amaresh");
        System.out.println(mymap);
    }
}
