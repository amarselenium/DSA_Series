/***
 * Created By: AmareshRout
 * Date: 12/9/24
 * Project Name: NagarroTest
 */

package StringManupalation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class retryTest {

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void mytest()
    {
        System.out.println("My testing has started");
        Assert.fail();
    }
}
