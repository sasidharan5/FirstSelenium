/**
 * Created by sasid on 1/17/2016.
 */
import com.auto.driverscript.*;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.ArrayList;




public class FirstPage {
    int s;
    String f;
    static utility_class uc = new utility_class();

    private static Logger log = Logger.getLogger(FirstPage.class.getName());
    public FirstPage() {
    }
    public  static void test1(String a, String b, String c) {
            log.info("mymsg");
            System.out.println("yes");
        WebDriver dr = DriverInstance.dr;
        dr.get(Constants.appurl);
        String actualtitle = dr.getTitle();

        WebDriver dr1 = new InternetExplorerDriver();
        dr1.get(Constants.appurl);
        System.out.println(dr.getTitle() +" " + dr1.getTitle());
       // Assert.assertEquals(actualtitle,Constants.expectedtitle);


        uc.test_sleep(5000);
        String oldtab = dr.getWindowHandle();
        dr.findElement(By.cssSelector("img[alt='Santander Bank']")).click();
        //dr.findElement(By.name("FirstLevelOption")).click();
        // /html/body/div[1]/div/div[1]/div/div[1]/div/div/div[2]/div/div/div/div/div/div[1]/h1/a/img
        //dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println("should have clicked");
        ArrayList<String> tabs = new ArrayList<String>(dr.getWindowHandles());
        ArrayList<String>tt = tabs;
        System.out.println(tabs.size());

        uc.test_sleep(5000);
        dr.switchTo().window(tabs.get(0));
        uc.test_sleep(5000);
        dr.findElement(By.linkText("Business")).click();
        WebElement e1 = dr.findElement(By.linkText("Business"));


       ArrayList<String> tabs1 = new ArrayList<String> (dr.getWindowHandles());
       System.out.println("ss");
/*
//        //dr.switchTo().window(tabs1.get(2));
        uc.test_sleep(10000);
        dr.findElement(By.className("wc2_close2")).click();
        /* training
        dr.navigate().to("http://www.google.com")
        WebElement a = dr.findElement(By.className("wc2_close2"))
        a.sendKeys(Keys.ENTER);
        a.clear();
        a.click();
        a.getAttribute("value");
        a.getText();
        a.isEnabled();
        a.isDisplayed();
        a.getLocation();
        a.getTagName();
        a.getScreenshotAs(OutputType.FILE);
        a.submit();
        */
/*
        uc.test_sleep(10000);

        //dr.findElement(By.xpath("//*[@id='uh-signin']")).click();
        //dr.close();
        //dr.quit();
        // /html/body/div[1]/div/div[1]/div/div[1]/div/div/div[3]/div/div/div/div/div/header/div[1]/nav/ul/li[2]/a
        ///html/body/div[1]/div/div[1]/div/div[1]/div/div/div[3]/div/div/div/div/div/header/div[2]/div/div/nav/ul/li[1]/ul/li[3]/a
        //}geckodriver.exe");

        */
    }



    /*public static void main(String s[]) {
        WebDriver dr;
        //System.setProperty("webdriver.firefox.marionette","C:\\driver\\
        //System.setProperty("webdriver.firefox.driver", "C:\\driver\\geckodriver.exe");
       // dr = new FirefoxDriver();
       dr = new InternetExplorerDriver();
        FirstPage tst = new FirstPage(dr);
        tst.test1();
        JavascriptExecutor javascript = (JavascriptExecutor) dr;
        javascript.executeScript("alert('Test Case Execution Is started Now..');");

    }*/
}