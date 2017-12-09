import io.github.bonigarcia.wdm.ChromeDriverManager;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class PierwszyTest {
    @Test
    public void firstTest() {
        ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://allegro.pl");
        //background-color: #e1f1e1

WebElement raty0procent = driver.findElement(By.linkText("Teraz na Allegro Raty 0%"));
        assertTrue("raty 0 procent jest nie widoczne",raty0procent.isEnabled());
        assertTrue("brakuje textu Allegro Raty",raty0procent.getText().contains("Allegro Raty"));
        raty0procent.click();

       List<WebElement> kategorieRat = driver.findElements(By.className("contentArticle__tileItem"));
       WebElement sportiWypoczynek = kategorieRat.get(3);
       WebElement wysukiwarka = driver.findElement(By.xpath("//div[contains(@class, 'atag')));
        assertTrue("brakuje textu Sport i Wypoczynek",sportiWypoczynek.getText().contains("Sport i wypoczynek"));
sportiWypoczynek.click();


    }
}
