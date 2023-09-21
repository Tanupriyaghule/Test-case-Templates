package test_case.codes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearch {
 WebDriver driver;
    public AmazonSearch() {
        System.out.println("Constructor: TestCases");
       
       // ChromeOptions co = new ChromeOptions();
       // co.setBrowserVersion("116");
        WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();
    }

    public void testCase01() {
        System.out.println("Start Test case: testCase01");
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("amazon");
        searchBox.submit();

        WebElement amazonLink = driver.findElement(By.partialLinkText("amazon.in"));
        if (amazonLink.isDisplayed()) {
            System.out.println("Amazon.in link found!");
        } else {
            System.out.println("Amazon.in link not found.");
        }
 WebElement amazonLink2 = driver.findElement(By.partialLinkText("amazon.com"));
        if (amazonLink2.isDisplayed()) {
            System.out.println("Amazon.com link found!");
        } else {
            System.out.println("Amazon.com link not found.");
        }
    }
}
