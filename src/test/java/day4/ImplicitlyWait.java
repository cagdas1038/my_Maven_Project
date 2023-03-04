package day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitlyWait {
    public static void main(String[] args)  {

        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        


        webDriver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        WebElement startButton = webDriver.findElement(By.cssSelector("#start>button"));

        startButton.click();



        WebElement hiddenText = webDriver.findElement(By.cssSelector("#finish>h4"));

        System.out.println(hiddenText.getText());

    }
}
