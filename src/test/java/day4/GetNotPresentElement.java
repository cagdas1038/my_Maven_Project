package day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetNotPresentElement {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

        webDriver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        WebElement startButton = webDriver.findElement(By.cssSelector("#start>button"));

        startButton.click();

        Thread.sleep(7000);





        WebElement hiddenText = webDriver.findElement(By.cssSelector("#finish>h4"));

        System.out.println(hiddenText.getText());


    }
}
