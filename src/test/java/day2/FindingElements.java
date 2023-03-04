package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techno.study");
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");

        driver.navigate().back();
        driver.navigate().forward();



       WebElement sloganText = driver.findElement(By.className("_8eso"));
       String expectedText = " Connect with friends and the world around you on FaceBook";
       String actualText = sloganText.getText();

       if (expectedText.equals(actualText)){
           System.out.println("verification is done: PASS ");
       }else {
           System.out.println("verification is FAILED");
           System.out.println("actual slogan text is : " + actualText);
       }








    }
}
