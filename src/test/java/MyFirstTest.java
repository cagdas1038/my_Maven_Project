import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
       driver.get("https://www.amazon.com/");

        //driver.getTitle();
        System.out.println( "title of amazon " + driver.getTitle());
        driver.getCurrentUrl();
        driver.navigate().to("http://www.techno.study");
        String expectedTitle = " Join the best coding bootcamps online and get IT training in the US";
        String actualTitle = driver.getTitle();
        if(expectedTitle.contains(actualTitle)){
            System.out.println("verification is done: PASS");
            System.out.println(actualTitle);
        } else {
            System.out.println("verification is FAILED");
            System.out.println(actualTitle);
        }


    }
}
