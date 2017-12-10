import io.github.bonigarcia.wdm.ChromeDriverManager;


import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class PierwszyTest {

 //  static WebDriver  driver;

    @BeforeClass public static void beforeClass(){
        ChromeDriverManager.getInstance().setup();

    }

    @Before public void beforeTest(){
      //  driver = new ChromeDriver();
        WebDriverSetup.driver.get("http://allegro.pl");
    }
    @After
    public void afterTest(){
    WebDriverSetup.driver.close();
    }
    @Test
    public void firstTest() {

WebElement raty0procent = WebDriverSetup.driver.findElement(By.linkText("Teraz na Allegro Raty 0%"));
        assertTrue("raty 0 procent jest nie widoczne",raty0procent.isEnabled());
        assertTrue("brakuje textu Allegro Raty",raty0procent.getText().contains("Allegro Raty"));
        raty0procent.click();

       List<WebElement> kategorieRat = WebDriverSetup.driver.findElements(By.className("contentArticle__tileItem"));
       WebElement sportiWypoczynek = kategorieRat.get(3);

        assertTrue("brakuje textu Sport i Wypoczynek",sportiWypoczynek.getText().contains("Sport i wypoczynek"));
sportiWypoczynek.click();



    }

    @Test public void allegroWyszukiwarkaTest(){
        WebElement wysukiwarka = WebDriverSetup.driver.findElement(By.xpath("//input[contains(@type, 'search')]"));
        wysukiwarka.sendKeys("Piłka");
        wysukiwarka.sendKeys(Keys.RETURN);
        assertEquals("Pole wyszukiwarki nie zawiera","Piłka",wysukiwarka.getAttribute("value").toString());
    }
}
