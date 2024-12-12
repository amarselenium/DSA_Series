/***
 * Created By: AmareshRout
 * Date: 12/9/24
 * Project Name: NagarroTest
 */

package StringManupalation;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class context {
    @BeforeTest
    public void test1a(ITestContext context){
        String cu_id= "1231212";
        context.setAttribute("ccid",cu_id);
        System.out.println("Value is stored in ITestContext");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    @Test
    public void testcase1(ITestContext context)
    {
        System.out.println(context.getClass());
        System.out.println(context.getAttribute("ccid"));
    }


}
