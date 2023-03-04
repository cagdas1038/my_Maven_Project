package day5;

import day1.SeleniumTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FacebookSignUp {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement createAccountButton = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createAccountButton.click();
        WebElement firstNameInput = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstNameInput.sendKeys("Atakan");
        WebElement lastNameInput = driver.findElement(By.cssSelector("input[name='lastname']"));
        lastNameInput.sendKeys("Azgin");
        WebElement emailInput = driver.findElement(By.cssSelector("input[name='reg_email__']"));
        emailInput.sendKeys("atakan.benn0102@gmail.com");
        WebElement emailAgain = driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
        emailAgain.sendKeys("atakan.benn0102@gmail.com");
        WebElement passwordInput = driver.findElement(By.cssSelector("input[name='reg_passwd__']"));
        passwordInput.sendKeys("1234567");

        WebElement monthDropdown = driver.findElement(By.id("month"));
        Select selectMonth = new Select(monthDropdown);
        selectMonth.selectByValue("December");

        WebElement dayDropdown = driver.findElement(By.id("day"));
        Select selectDay = new Select(dayDropdown);
        selectDay.selectByValue("29");

        WebElement yearDropdown = driver.findElement(By.id("year"));
        Select selectYear = new Select(yearDropdown);
        selectYear.selectByVisibleText("1998");

        WebElement maleOptionRadioButton = driver.findElement(By.cssSelector("input[value='2']"));
        maleOptionRadioButton.click();

        WebElement singUpButton = driver.findElement(By.cssSelector("button[name='websubmit']"));
        String signUpButtonText = singUpButton.getText();
        System.out.println(signUpButtonText);
        driver.quit();
        //--------- bekletmek icin-----------------------------------------------
        WebDriverWait wait = new WebDriverWait(driver,10);

        WebElement finishText = driver.findElement(By.cssSelector("#finish>h4"));
        wait.until(ExpectedConditions.visibilityOf(finishText));
        System.out.println(finishText.getText());



    }
}
