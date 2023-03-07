
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class Demo {

    @Test
    public void launch() throws InterruptedException {


        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Navigate to the demoqa website
        driver.get("http://65.1.221.73/login");

        String temp = "//*[@id=&quot;email&quot;]";
        String temp1 = temp.replace("&quot;", "~" );
        String temp2 = temp1.replace('~', '"' );


        System.out.println(temp2);

        driver.manage().window().maximize();

       // WebElement e = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        WebElement e = driver.findElement(By.xpath(temp2));

        e.sendKeys("prashant.sonawane@exazeit.com");

        Thread.sleep(10000);



        driver.quit();

    }

}
