import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class bookSearch {

    @Test
    public void launch() throws InterruptedException {


        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Navigate to the demoqa website
        driver.get("https://automationbookstore.dev/");


        driver.manage().window().maximize();

        List<WebElement> listOfBooks = driver.findElements(By.xpath("//*[@id=\"productList\"]/child::li"));



        for(int i=0;i<listOfBooks.size();i++)
        {
            System.out.println("\n");
            System.out.println(listOfBooks.get(i).getText());

        }


        WebElement e1 = driver.findElement(By.xpath("//*[@id=\"searchBar\"]"));

        e1.sendKeys("The Cucumber");


        WebElement e2 = driver.findElement(By.xpath("//*[@id=\"pid7_title\"]"));

        System.out.println(e2.getText());

        driver.quit();

    }

}
