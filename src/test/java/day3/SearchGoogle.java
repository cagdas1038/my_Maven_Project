package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        String input = "bamboo pen";

       WebElement searchBox = driver.findElement(By.name("q"));

       searchBox.sendKeys(input+ Keys.ENTER);


       String actualTitle = driver.getTitle();
       String expectedTitle = "bamboo pen - Google Search";

       if (actualTitle.equals(expectedTitle)){
           System.out.println("verification is DONE : PASS");
       }else{
           System.out.println("verification is : FAILED");
           System.out.println("Actual title is : " + actualTitle);
       }













    }
}
