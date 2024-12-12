/***
 * Created By: AmareshRout
 * Date: 12/9/24
 * Project Name: NagarroTest
 */

package StringManupalation;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class RetryAnalyser implements IRetryAnalyzer {

    int count =2;

    @Override
    public boolean retry(final ITestResult Result) {
        while(count>0)
        {
            count--;
            System.out.println("the test case is failings" + Result.getStatus() + "*****" + Result.getName()+ "***" + count);
        }

        return false;
    }
}
