package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAddressVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://www.facebook.com");

        WebElement emailBox = driver.findElement(By.id("email"));
        emailBox.sendKeys("cagdasazgin@gmail.com");

        WebElement passwordBox = driver.findElement(By.cssSelector("input[type='password']"));
        passwordBox.sendKeys("123456");






    }

}
