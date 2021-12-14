package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) {

        WebDriver driver;
        String Url = "http://iamneo.ai";
        String facebook = "https://www.facebook.com";

        System.setProperty("webdriver.chrome.driver",
                "C:\\libs\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(Url);
        String titleOfThePage = driver.getTitle();
        if (titleOfThePage.equals("We are Hiring!")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        driver.navigate().to(facebook);
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL :: " + currentUrl);
        driver.navigate().back();
        driver.navigate().refresh();
    }

}
