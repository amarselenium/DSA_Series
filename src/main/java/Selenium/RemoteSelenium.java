/***
 * Created By: AmareshRout
 * Date: 12/8/24
 * Project Name: NagarroTest
 */

package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RemoteSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--disable-notifications");
        //options.addArguments("--remote-allow-origins=*");
        //options.addArguments("--remote-debugging-port=9222");
        options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.login.xtime.com");
        driver.close();
    }
}
