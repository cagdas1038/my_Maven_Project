package day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitByTryCatch {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

        webDriver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

      WebElement startButton = webDriver.findElement(By.cssSelector("#start>button"));

      startButton.click();

        String text = "";
        while (text.equals("")){
            try {
                WebElement hiddenText = webDriver.findElement(By.cssSelector("#finish>h4"));
                text = hiddenText.getText();

            }catch (NoSuchElementException ex){
                System.out.println("trying to find the hidden text");

            }
        }
        System.out.println(text);
    }
}
