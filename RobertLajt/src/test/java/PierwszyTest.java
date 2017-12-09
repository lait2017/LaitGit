import io.github.bonigarcia.wdm.ChromeDriverManager;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;


public class PierwszyTest {
    @Test
    public void firstTest() {
        ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://allegro.pl");
WebElement raty0procent = driver.findElement(By.linkText("Teraz na Allegro Raty 0%"));
//WebElement raty0 = driver.findElement(By.xpath("//div[@class='bar-wrapper']" +
 //       "/p[@class='message']/a"));
        assertTrue("");
raty0procent.click();
        //raty0.click();
//        FirefoxDriverManager.getInstance().setup();
//        WebDriver firefoxDriver = new FirefoxDriver();
//        firefoxDriver.get("http://google.pl");
    }

}
