package day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        WebElement dropDown = driver.findElement(By.id("select-demo"));

        Select select = new Select(dropDown);
        select.selectByIndex(1);
        Thread.sleep(1000);

        select.selectByValue("Tuesday");
        Thread.sleep(1000);

        select.selectByVisibleText("Saturday");

        String selectedOption = select.getFirstSelectedOption().getText();
        String expected = "Saturday";

        if (selectedOption.equals(expected)){
            System.out.println("PASS");
        }else {
            System.out.println("FAILED");
        }





    }
}
