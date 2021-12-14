package Selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class FlipkartLink {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver",
                "C:\\libs\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        List<WebElement> li=driver.findElements(By.tagName("a"));
        System.out.println(li.size());
        for(WebElement e:li){
            System.out.println(e.getAttribute("href"));
        }
        //quit
        driver.quit();
    }
}
